package org.junit.rules;

import java.io.File;
import java.io.IOException;
import p153l.cqg0;
import p153l.wtq0;
import p153l.zpg0;

/* JADX INFO: loaded from: classes3.dex */
public class TemporaryFolder extends ExternalResource {
    private File folder;
    private final File parentFolder;

    public TemporaryFolder(File file) {
        this.parentFolder = file;
    }

    private File createTemporaryFolderIn(File file) throws IOException {
        File fileCreateTempFile = File.createTempFile("junit", "", file);
        fileCreateTempFile.delete();
        fileCreateTempFile.mkdir();
        return fileCreateTempFile;
    }

    private boolean isLastElementInArray(int i, String[] strArr) {
        return i == strArr.length - 1;
    }

    private void recursiveDelete(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                recursiveDelete(file2);
            }
        }
        file.delete();
    }

    private void validateFolderName(String str) throws IOException {
        if (new File(str).getParent() == null) {
            return;
        }
        zpg0.m220844a("Folder name cannot consist of multiple path components separated by a file separator. Please use newFolder('MyParentFolder','MyFolder') to create hierarchies of folders");
    }

    @Override // org.junit.rules.ExternalResource
    public void after() {
        delete();
    }

    @Override // org.junit.rules.ExternalResource
    public void before() throws Throwable {
        create();
    }

    public void create() throws IOException {
        this.folder = createTemporaryFolderIn(this.parentFolder);
    }

    public void delete() {
        File file = this.folder;
        if (file != null) {
            recursiveDelete(file);
        }
    }

    public File getRoot() {
        File file = this.folder;
        if (file != null) {
            return file;
        }
        wtq0.m207906a("the temporary folder has not yet been created");
        return null;
    }

    public File newFile(String str) throws IOException {
        File file = new File(getRoot(), str);
        if (file.createNewFile()) {
            return file;
        }
        cqg0.m111899a("a file with the name '", str, "' already exists in the test folder");
        return null;
    }

    public File newFolder(String... strArr) throws IOException {
        File root = getRoot();
        int i = 0;
        while (i < strArr.length) {
            String str = strArr[i];
            validateFolderName(str);
            File file = new File(root, str);
            if (!file.mkdir() && isLastElementInArray(i, strArr)) {
                cqg0.m111899a("a folder with the name '", str, "' already exists");
                return null;
            }
            i++;
            root = file;
        }
        return root;
    }

    public TemporaryFolder() {
        this(null);
    }

    public File newFile() throws IOException {
        return File.createTempFile("junit", null, getRoot());
    }

    public File newFolder(String str) throws IOException {
        return newFolder(str);
    }

    public File newFolder() throws IOException {
        return createTemporaryFolderIn(getRoot());
    }
}
