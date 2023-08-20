package com.thepuar.watchdog.repository;




import com.thepuar.watchdog.model.VideoRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRecordRepository extends JpaRepository<VideoRecord, Long>, CrudRepository< VideoRecord,Long>, PagingAndSortingRepository<VideoRecord,Long> {

    public List<VideoRecord> findByConverted(Boolean converted);

    public VideoRecord findByName(String name);

    public List<VideoRecord> findByFolder(String folder);

    public List<VideoRecord> findByFolderOrderByCreationTimeAsc(String folder);

    //public List<VideoRecord> findByFolderPageable(String folder, Pageable pageable);

    @Query("SELECT DISTINCT(folder) FROM VideoRecord ORDER BY folder ASC")
    public List<String> getAllDays();

}
