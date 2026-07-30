package p153l;

import android.os.AsyncTask;
import androidx.annotation.VisibleForTesting;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u000eB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00042\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\f\"\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/sii;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "", "uriStr", "Ljava/io/File;", "destFile", "Ll/sii$a;", "onSuccess", "<init>", "(Ljava/lang/String;Ljava/io/File;Ll/sii$a;)V", "", "args", "a", "([Ljava/lang/String;)Ljava/lang/Boolean;", "isSuccess", "", "b", "(Z)V", "Ljava/lang/String;", "Ljava/io/File;", "c", "Ll/sii$a;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class sii extends AsyncTask<String, Void, Boolean> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String uriStr;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final File destFile;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC20049a onSuccess;

    /* JADX INFO: renamed from: l.sii$a */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Ll/sii$a;", "", "Ljava/io/File;", "file", "", "a", "(Ljava/io/File;)V", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public interface InterfaceC20049a {
        /* JADX INFO: renamed from: a */
        void mo186018a(@NotNull File file);
    }

    public sii(@NotNull String str, @NotNull File file, @NotNull InterfaceC20049a interfaceC20049a) {
        str.getClass();
        file.getClass();
        interfaceC20049a.getClass();
        this.uriStr = str;
        this.destFile = file;
        this.onSuccess = interfaceC20049a;
    }

    @VisibleForTesting(otherwise = 4)
    @NotNull
    /* JADX INFO: renamed from: a */
    public Boolean m186016a(@NotNull String... args) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            args.getClass();
            try {
                URL url = new URL(this.uriStr);
                int contentLength = url.openConnection().getContentLength();
                DataInputStream dataInputStream = new DataInputStream(url.openStream());
                byte[] bArr = new byte[contentLength];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.destFile));
                dataOutputStream.write(bArr);
                dataOutputStream.flush();
                dataOutputStream.close();
                return Boolean.TRUE;
            } catch (Exception unused) {
                return Boolean.FALSE;
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m186017b(boolean isSuccess) {
        if (!ztb.m221490d(this) && isSuccess) {
            try {
                this.onSuccess.mo186018a(this.destFile);
            } catch (Throwable th) {
                ztb.m221488b(th, this);
            }
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (ztb.m221490d(this)) {
            return null;
        }
        try {
            return m186016a(strArr);
        } catch (Throwable th) {
            ztb.m221488b(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Boolean bool) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            m186017b(bool.booleanValue());
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }
}
