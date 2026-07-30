package org.seamless.util.p006io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import l.csg0;
import l.ig3;
import org.eclipse.jetty.util.StringUtil;
import p003l.qhg0;

/* JADX INFO: renamed from: org.seamless.util.io.IO */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C0944IO {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final String LINE_SEPARATOR;

    /* JADX INFO: renamed from: org.seamless.util.io.IO$FileFinder */
    public interface FileFinder {
        void found(File file);
    }

    static {
        StringWriter stringWriter = new StringWriter(4);
        new PrintWriter(stringWriter).println();
        LINE_SEPARATOR = stringWriter.toString();
    }

    public static void closeQuietly(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean contentEquals(InputStream inputStream, InputStream inputStream2) throws IOException {
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream);
        }
        if (!(inputStream2 instanceof BufferedInputStream)) {
            inputStream2 = new BufferedInputStream(inputStream2);
        }
        for (int i = inputStream.read(); -1 != i; i = inputStream.read()) {
            if (i != inputStream2.read()) {
                return false;
            }
        }
        return inputStream2.read() == -1;
    }

    public static void copy(Reader reader, OutputStream outputStream, String str) throws IOException {
        if (str == null) {
            copy(reader, outputStream);
            return;
        }
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, str);
        copy(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void copyFile(File file, File file2) throws Throwable {
        Throwable th;
        FileChannel channel;
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FileChannel fileChannel = null;
        try {
            FileChannel channel2 = new FileInputStream(file).getChannel();
            try {
                channel = new FileOutputStream(file2).getChannel();
                try {
                    channel.transferFrom(channel2, 0L, channel2.size());
                    channel2.close();
                    channel.close();
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = channel2;
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (channel == null) {
                        throw th;
                    }
                    channel.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                channel = null;
            }
        } catch (Throwable th4) {
            th = th4;
            channel = null;
        }
    }

    public static long copyLarge(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                return j;
            }
            outputStream.write(bArr, 0, i);
            j += (long) i;
        }
    }

    public static boolean deleteFile(File file) {
        File[] fileArrListFiles;
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    deleteFile(file2);
                } else {
                    file2.delete();
                }
            }
        }
        return file.delete();
    }

    public static void findFiles(File file, FileFinder fileFinder) {
        fileFinder.found(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                findFiles(file2, fileFinder);
            }
        }
    }

    public static String makeRelativePath(String str, String str2) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        if (str.startsWith("/")) {
            if (str.startsWith(str2)) {
                str = str.substring(str2.length());
            } else {
                str = str2 + str;
            }
        } else if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        return str.startsWith("/") ? str.substring(1) : str;
    }

    public static byte[] readBytes(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return readBytes(fileInputStream);
        } finally {
            fileInputStream.close();
        }
    }

    public static String[] readLines(File file, boolean z, Character ch, boolean z2) throws IOException {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                if (ch != null) {
                    if (line.matches("^\\s*" + ch + ".*")) {
                    }
                }
                if (z) {
                    line = line.trim();
                }
                if (!z2 || line.length() != 0) {
                    arrayList.add(line);
                }
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        }
    }

    public static void recursiveRename(File file, String str, String str2) {
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                recursiveRename(file2, str, str2);
                file2.renameTo(new File(file, file2.getName().replace(str, str2)));
            } else {
                file2.renameTo(new File(file, file2.getName().replace(str, str2)));
            }
        }
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static char[] toCharArray(InputStream inputStream) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        copy(inputStream, charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static InputStream toInputStream(String str, String str2) throws IOException {
        return new ByteArrayInputStream(str2 != null ? str.getBytes(str2) : str.getBytes());
    }

    public static String toString(byte[] bArr, String str) throws IOException {
        return str == null ? new String(bArr) : new String(bArr, str);
    }

    public static void write(char[] cArr, OutputStream outputStream, String str) throws IOException {
        if (cArr != null) {
            if (str == null) {
                write(cArr, outputStream);
            } else {
                outputStream.write(new String(cArr).getBytes(str));
            }
        }
    }

    public static void writeBytes(File file, byte[] bArr) throws IOException {
        if (file == null) {
            ig3.a("File should not be null.");
            return;
        }
        if (!file.exists()) {
            csg0.a("File does not exist: ", file);
            return;
        }
        if (!file.isFile()) {
            qhg0.m7021a("Should not be a directory: ", file);
            return;
        }
        if (!file.canWrite()) {
            qhg0.m7021a("File cannot be written: ", file);
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            writeBytes(fileOutputStream, bArr);
            fileOutputStream.flush();
        } finally {
            fileOutputStream.close();
        }
    }

    public static void writeUTF8(File file, String str) throws IOException {
        if (file == null) {
            ig3.a("File should not be null.");
            return;
        }
        if (!file.exists()) {
            csg0.a("File does not exist: ", file);
            return;
        }
        if (!file.isFile()) {
            qhg0.m7021a("Should not be a directory: ", file);
            return;
        }
        if (!file.canWrite()) {
            qhg0.m7021a("File cannot be written: ", file);
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            writeUTF8(fileOutputStream, str);
            fileOutputStream.flush();
        } finally {
            fileOutputStream.close();
        }
    }

    public static void closeQuietly(Writer writer) {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeQuietly(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeQuietly(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] toByteArray(Reader reader) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(reader, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static char[] toCharArray(InputStream inputStream, String str) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        copy(inputStream, charArrayWriter, str);
        return charArrayWriter.toCharArray();
    }

    public static String toString(InputStream inputStream, String str) throws IOException {
        StringWriter stringWriter = new StringWriter();
        copy(inputStream, stringWriter, str);
        return stringWriter.toString();
    }

    public static byte[] toByteArray(Reader reader, String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(reader, byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }

    public static char[] toCharArray(Reader reader) throws IOException {
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        copy(reader, charArrayWriter);
        return charArrayWriter.toCharArray();
    }

    public static InputStream toInputStream(String str) {
        return new ByteArrayInputStream(str.getBytes());
    }

    public static String toString(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        copy(reader, stringWriter);
        return stringWriter.toString();
    }

    public static void copy(InputStream inputStream, Writer writer) throws IOException {
        copy(new InputStreamReader(inputStream), writer);
    }

    public static byte[] readBytes(InputStream inputStream) throws IOException {
        return toByteArray(inputStream);
    }

    public static byte[] toByteArray(String str) throws IOException {
        return str.getBytes();
    }

    public static void copy(InputStream inputStream, Writer writer, String str) throws IOException {
        if (str == null) {
            copy(inputStream, writer);
        } else {
            copy(new InputStreamReader(inputStream, str), writer);
        }
    }

    public static String toString(byte[] bArr) throws IOException {
        return new String(bArr);
    }

    public static long copyLarge(Reader reader, Writer writer) throws IOException {
        char[] cArr = new char[4096];
        long j = 0;
        while (true) {
            int i = reader.read(cArr);
            if (-1 == i) {
                return j;
            }
            writer.write(cArr, 0, i);
            j += (long) i;
        }
    }

    public static String toString(InputStream inputStream) throws IOException {
        StringWriter stringWriter = new StringWriter();
        copy(inputStream, stringWriter);
        return stringWriter.toString();
    }

    public static void write(byte[] bArr, Writer writer) throws IOException {
        if (bArr != null) {
            writer.write(new String(bArr));
        }
    }

    public static void write(byte[] bArr, Writer writer, String str) throws IOException {
        if (bArr != null) {
            if (str == null) {
                write(bArr, writer);
            } else {
                writer.write(new String(bArr, str));
            }
        }
    }

    public static int copy(Reader reader, Writer writer) throws IOException {
        long jCopyLarge = copyLarge(reader, writer);
        if (jCopyLarge > 2147483647L) {
            return -1;
        }
        return (int) jCopyLarge;
    }

    public static void copy(Reader reader, OutputStream outputStream) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        copy(reader, outputStreamWriter);
        outputStreamWriter.flush();
    }

    public static void write(char[] cArr, Writer writer) throws IOException {
        if (cArr != null) {
            writer.write(cArr);
        }
    }

    public static void write(char[] cArr, OutputStream outputStream) throws IOException {
        if (cArr != null) {
            outputStream.write(new String(cArr).getBytes());
        }
    }

    public static void write(byte[] bArr, OutputStream outputStream) throws IOException {
        if (bArr != null) {
            outputStream.write(bArr);
        }
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        long jCopyLarge = copyLarge(inputStream, outputStream);
        if (jCopyLarge > 2147483647L) {
            return -1;
        }
        return (int) jCopyLarge;
    }

    public static void write(String str, Writer writer) throws IOException {
        if (str != null) {
            writer.write(str);
        }
    }

    public static void write(String str, OutputStream outputStream) throws IOException {
        if (str != null) {
            outputStream.write(str.getBytes());
        }
    }

    public static void write(String str, OutputStream outputStream, String str2) throws IOException {
        if (str != null) {
            if (str2 == null) {
                write(str, outputStream);
            } else {
                outputStream.write(str.getBytes(str2));
            }
        }
    }

    public static void write(StringBuffer stringBuffer, Writer writer) throws IOException {
        if (stringBuffer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    public static void write(StringBuffer stringBuffer, OutputStream outputStream) throws IOException {
        if (stringBuffer != null) {
            outputStream.write(stringBuffer.toString().getBytes());
        }
    }

    public static void write(StringBuffer stringBuffer, OutputStream outputStream, String str) throws IOException {
        if (stringBuffer != null) {
            if (str == null) {
                write(stringBuffer, outputStream);
            } else {
                outputStream.write(stringBuffer.toString().getBytes(str));
            }
        }
    }

    public static boolean contentEquals(Reader reader, Reader reader2) throws IOException {
        if (!(reader instanceof BufferedReader)) {
            reader = new BufferedReader(reader);
        }
        if (!(reader2 instanceof BufferedReader)) {
            reader2 = new BufferedReader(reader2);
        }
        for (int i = reader.read(); -1 != i; i = reader.read()) {
            if (i != reader2.read()) {
                return false;
            }
        }
        return reader2.read() == -1;
    }

    public static void writeBytes(OutputStream outputStream, byte[] bArr) throws IOException {
        write(bArr, outputStream);
    }

    public static void writeUTF8(OutputStream outputStream, String str) throws IOException {
        write(str, outputStream, StringUtil.__UTF8);
    }

    public static String readLines(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return readLines(fileInputStream);
        } finally {
            fileInputStream.close();
        }
    }

    public static String[] readLines(File file, boolean z) throws IOException {
        return readLines(file, z, null);
    }

    public static String[] readLines(File file, boolean z, Character ch) throws IOException {
        return readLines(file, z, ch, false);
    }

    public static String readLines(InputStream inputStream) throws IOException {
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
                sb.append(System.getProperty("line.separator"));
            }
            return sb.length() > 0 ? sb.toString() : "";
        }
        ig3.a("Inputstream was null");
        return null;
    }
}
