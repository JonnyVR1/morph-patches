package org.apache.commons.sudcompress.archivers.zip;

import com.immomo.momomediaext.sei.BaseSei;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import p153l.wg3;
import p153l.xfg0;
import p153l.zpg0;

/* JADX INFO: loaded from: classes2.dex */
public class ZipSplitReadOnlySeekableByteChannel extends xfg0 {
    private static final int ZIP_SPLIT_SIGNATURE_LENGTH = 4;
    private final ByteBuffer zipSplitSignatureByteBuffer;

    public static class ZipSplitSegmentComparator implements Comparator<File>, Serializable {
        private static final long serialVersionUID = 20200123;

        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            String strSubstring;
            String path = file.getPath();
            String strSubstring2 = "";
            if (path == null) {
                strSubstring = null;
            } else {
                String name = new File(path).getName();
                int iLastIndexOf = name.lastIndexOf(46);
                strSubstring = iLastIndexOf < 0 ? "" : name.substring(iLastIndexOf + 1);
            }
            String path2 = file2.getPath();
            if (path2 == null) {
                strSubstring2 = null;
            } else {
                String name2 = new File(path2).getName();
                int iLastIndexOf2 = name2.lastIndexOf(46);
                if (iLastIndexOf2 >= 0) {
                    strSubstring2 = name2.substring(iLastIndexOf2 + 1);
                }
            }
            if (!strSubstring.startsWith(BaseSei.f14626Z)) {
                return -1;
            }
            if (strSubstring2.startsWith(BaseSei.f14626Z)) {
                return Integer.valueOf(Integer.parseInt(strSubstring.substring(1))).compareTo(Integer.valueOf(Integer.parseInt(strSubstring2.substring(1))));
            }
            return 1;
        }

        private ZipSplitSegmentComparator() {
        }
    }

    public ZipSplitReadOnlySeekableByteChannel(List<SeekableByteChannel> list) throws IOException {
        super(list);
        this.zipSplitSignatureByteBuffer = ByteBuffer.allocate(4);
        assertSplitSignature(list);
    }

    private void assertSplitSignature(List<SeekableByteChannel> list) throws IOException {
        SeekableByteChannel seekableByteChannel = list.get(0);
        seekableByteChannel.position(0L);
        this.zipSplitSignatureByteBuffer.rewind();
        seekableByteChannel.read(this.zipSplitSignatureByteBuffer);
        if (new ZipLong(this.zipSplitSignatureByteBuffer.array()).equals(ZipLong.DD_SIG)) {
            seekableByteChannel.position(0L);
        } else {
            seekableByteChannel.position(0L);
            zpg0.m220844a("The first zip split segment does not begin with split zip file signature");
        }
    }

    public static SeekableByteChannel buildFromLastSplitSegment(File file) throws IOException {
        String strSubstring;
        String name;
        String canonicalPath = file.getCanonicalPath();
        if (canonicalPath == null) {
            strSubstring = null;
        } else {
            String name2 = new File(canonicalPath).getName();
            int iLastIndexOf = name2.lastIndexOf(46);
            strSubstring = iLastIndexOf < 0 ? "" : name2.substring(iLastIndexOf + 1);
        }
        if (!strSubstring.equalsIgnoreCase("zip")) {
            wg3.m206174a("The extension of last zip split segment should be .zip");
            return null;
        }
        File parentFile = file.getParentFile();
        String canonicalPath2 = file.getCanonicalPath();
        if (canonicalPath2 == null) {
            name = null;
        } else {
            name = new File(canonicalPath2).getName();
            int iLastIndexOf2 = name.lastIndexOf(46);
            if (iLastIndexOf2 >= 0) {
                name = name.substring(0, iLastIndexOf2);
            }
        }
        ArrayList arrayList = new ArrayList();
        Pattern patternCompile = Pattern.compile(Pattern.quote(name) + ".[zZ][0-9]+");
        File[] fileArrListFiles = parentFile.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (patternCompile.matcher(file2.getName()).matches()) {
                    arrayList.add(file2);
                }
            }
        }
        Collections.sort(arrayList, new ZipSplitSegmentComparator());
        return forFiles(file, arrayList);
    }

    public static SeekableByteChannel forFiles(File... fileArr) {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(fileArr, "files must not be null");
        for (File file : fileArr) {
            arrayList.add(Files.newByteChannel(file.toPath(), StandardOpenOption.READ));
        }
        return arrayList.size() == 1 ? (SeekableByteChannel) arrayList.get(0) : new ZipSplitReadOnlySeekableByteChannel(arrayList);
    }

    public static SeekableByteChannel forOrderedSeekableByteChannels(SeekableByteChannel seekableByteChannel, Iterable<SeekableByteChannel> iterable) {
        Objects.requireNonNull(iterable, "channels");
        Objects.requireNonNull(seekableByteChannel, "lastSegmentChannel");
        ArrayList arrayList = new ArrayList();
        Iterator<SeekableByteChannel> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(seekableByteChannel);
        return forOrderedSeekableByteChannels((SeekableByteChannel[]) arrayList.toArray(new SeekableByteChannel[arrayList.size()]));
    }

    public static SeekableByteChannel forOrderedSeekableByteChannels(SeekableByteChannel... seekableByteChannelArr) {
        Objects.requireNonNull(seekableByteChannelArr, "channels must not be null");
        if (seekableByteChannelArr.length == 1) {
            return seekableByteChannelArr[0];
        }
        return new ZipSplitReadOnlySeekableByteChannel(Arrays.asList(seekableByteChannelArr));
    }

    public static SeekableByteChannel forFiles(File file, Iterable<File> iterable) {
        Objects.requireNonNull(iterable, "files");
        Objects.requireNonNull(file, "lastSegmentFile");
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(file);
        return forFiles((File[]) arrayList.toArray(new File[arrayList.size()]));
    }
}
