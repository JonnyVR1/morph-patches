package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.Priority;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class vqn0 {

    /* JADX INFO: renamed from: a */
    public final String f185377a;

    /* JADX INFO: renamed from: b */
    public final String f185378b;

    /* JADX INFO: renamed from: l.vqn0$a */
    public class C20902a extends jj2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f185379a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f185380b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ w8e f185381c;

        public C20902a(String str, String str2, w8e w8eVar) {
            this.f185379a = str;
            this.f185380b = str2;
            this.f185381c = w8eVar;
        }

        @Override // p153l.jj2, p153l.w8e
        /* JADX INFO: renamed from: a */
        public void mo75431a(@NonNull File file) throws Throwable {
            super.mo75431a(file);
            File file2 = new File(vqn0.this.m202431h());
            if (!file2.exists()) {
                file2.getParentFile().mkdir();
                file2.mkdir();
            }
            File file3 = new File(vqn0.this.m202431h(), this.f185379a + "." + this.f185380b);
            boolean zM210945i = xgt.m210945i(file, file3);
            nki.m163623f(file);
            fhw.m125605a("[voice][ktv]", "unzip:" + zM210945i + ",path:" + file.getAbsolutePath());
            if (!zM210945i || !file3.exists()) {
                nki.m163623f(file3);
                w8e w8eVar = this.f185381c;
                if (w8eVar != null) {
                    w8eVar.onFailed("unzip fail");
                    return;
                }
                return;
            }
            w8e w8eVar2 = this.f185381c;
            if (w8eVar2 != null) {
                w8eVar2.mo75431a(new File(vqn0.this.m202431h(), this.f185379a + "." + this.f185380b));
            }
        }

        @Override // p153l.jj2, p153l.w8e
        public void onFailed(@NonNull String str) {
            super.onFailed(str);
            w8e w8eVar = this.f185381c;
            if (w8eVar != null) {
                w8eVar.onFailed(str);
            }
        }
    }

    /* JADX INFO: renamed from: l.vqn0$b */
    public class C20903b extends jj2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ w8e f185383a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f185384b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f185385c;

        public C20903b(w8e w8eVar, String str, String str2) {
            this.f185383a = w8eVar;
            this.f185384b = str;
            this.f185385c = str2;
        }

        @Override // p153l.jj2, p153l.w8e
        /* JADX INFO: renamed from: a */
        public void mo75431a(@NonNull File file) {
            super.mo75431a(file);
            w8e w8eVar = this.f185383a;
            if (w8eVar != null) {
                w8eVar.mo75431a(new File(vqn0.this.m202431h(), this.f185384b + "." + this.f185385c));
            }
        }

        @Override // p153l.jj2, p153l.w8e
        public void onFailed(@NonNull String str) {
            super.onFailed(str);
            w8e w8eVar = this.f185383a;
            if (w8eVar != null) {
                w8eVar.onFailed(str);
            }
        }
    }

    /* JADX INFO: renamed from: l.vqn0$c */
    public static class C20904c {
        private static final vqn0 INSTANCE = new vqn0();
    }

    public vqn0() {
        this.f185377a = "voiceKtv";
        this.f185378b = "lrc";
    }

    /* JADX INFO: renamed from: g */
    public static vqn0 m202426g() {
        return C20904c.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public void m202427c() {
        nki.m163623f(new File(zrv.f205803e.getFilesDir(), "voiceKtv"));
    }

    /* JADX INFO: renamed from: d */
    public void m202428d(String str) {
        nki.m163623f(new File("voiceKtv", str));
    }

    /* JADX INFO: renamed from: e */
    public final void m202429e(String str, String str2, String str3, w8e w8eVar) {
        n9s.m162004B().m162033z(new f9e.C16927a(str2, m202434k() + File.separator + str + ".zip").m124655i(Priority.get("IMMEDIATE")).m124647a(), new C20902a(str, str3, w8eVar));
    }

    /* JADX INFO: renamed from: f */
    public final void m202430f(String str, String str2, String str3, w8e w8eVar) {
        n9s.m162004B().m162033z(new f9e.C16927a(str2, m202431h() + File.separator + str + ".lrc").m124655i(Priority.get("IMMEDIATE")).m124647a(), new C20903b(w8eVar, str, str3));
    }

    /* JADX INFO: renamed from: h */
    public final String m202431h() {
        return m202434k() + File.separator + "lrc";
    }

    /* JADX INFO: renamed from: i */
    public void m202432i(String str, String str2, String str3, String str4, w8e w8eVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            w8eVar.onFailed("invalid lrc param");
            fhw.m125605a("[voice][ktv]", "getLrcFile invalid param");
            return;
        }
        if (!TextUtils.isEmpty(str4)) {
            fhw.m125605a("[voice][ktv]", "getLrcFile provider:" + str4);
        }
        if (!m202437n(str, str3)) {
            fhw.m125605a("[voice][ktv]", "getLrcFile download:" + str + Constants.SEPARATOR_COMMA + str3 + Constants.SEPARATOR_COMMA + str2);
            if (!y6s.f197711d.equals(str4) || str2.endsWith("zip")) {
                m202429e(str, str2, str3, w8eVar);
                return;
            } else {
                m202430f(str, str2, str3, w8eVar);
                return;
            }
        }
        if (w8eVar != null) {
            fhw.m125605a("[voice][ktv]", "getLrcFile exist:" + str + "." + str3);
            w8eVar.mo75431a(new File(m202431h() + File.separator + str + "." + str3));
        }
    }

    /* JADX INFO: renamed from: j */
    public String m202433j(String str, String str2) {
        return m202431h() + File.separator + str + "." + str2;
    }

    /* JADX INFO: renamed from: k */
    public String m202434k() {
        return zrv.f205803e.getFilesDir() + File.separator + "voiceKtv";
    }

    /* JADX INFO: renamed from: l */
    public String m202435l(String str) {
        return m202434k() + File.separator + str;
    }

    /* JADX INFO: renamed from: m */
    public void m202436m(final String str, String str2, w8e w8eVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            w8eVar.onFailed("invalid song param");
            fhw.m125605a("[voice][ktv]", "getSongFile invalid param");
            return;
        }
        if (!m202438o(str)) {
            fhw.m125605a("[voice][ktv]", "getSongFile download:" + str + "，" + str2);
            n9s.m162004B().m162033z(new f9e.C16927a(str2, m202434k() + File.separator + pzi0.m174454o()).m124655i(Priority.get("IMMEDIATE")).m124654h(new rcj() { // from class: l.uqn0
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return this.f180494a.m202439p(str, (String) obj, (File) obj2);
                }
            }).m124647a(), w8eVar);
            return;
        }
        if (w8eVar != null) {
            fhw.m125605a("[voice][ktv]", "getSongFile exist:" + str + Constants.SEPARATOR_COMMA + str2);
            w8eVar.mo75431a(new File(m202434k() + File.separator + str));
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m202437n(String str, String str2) {
        return nki.m163629l(m202431h() + File.separator + str + "." + str2);
    }

    /* JADX INFO: renamed from: o */
    public boolean m202438o(String str) {
        return nki.m163629l(m202434k() + File.separator + str);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ File m202439p(String str, String str2, File file) {
        File file2 = new File(m202434k(), str);
        return file.renameTo(file2) ? file2 : file;
    }
}
