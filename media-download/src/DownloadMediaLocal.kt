
import com.hexarchbootdemo.application.port.output.repository.DownloadMediaPort
import com.hexarchbootdemo.application.port.output.repository.FindVoterPort
import javax.inject.Inject
import javax.inject.Named

@Suppress
@Named("downloadMedia")
class DownloadMediaLocal {
    @Inject
    lateinit var downloadMediaPort: DownloadMediaPort

    fun downloadMediaLocal(){

    }

}
