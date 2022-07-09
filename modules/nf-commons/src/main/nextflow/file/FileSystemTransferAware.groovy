package nextflow.file

import java.nio.file.CopyOption
import java.nio.file.Path


/**
 * @author : jorge <jorge.aguilera@seqera.io>
 *
 */
interface FileSystemTransferAware {

    boolean canTransfer(Path source, Path target, CopyOption... options)

    void copyTransfer(Path source, Path target, CopyOption... options) throws IOException

}
