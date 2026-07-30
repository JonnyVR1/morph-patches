package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.Priority;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class rhn0 {

    /* JADX INFO: renamed from: a */
    public final String f159455a;

    /* JADX INFO: renamed from: b */
    public final String f159456b;

    /* JADX INFO: renamed from: l.rhn0$a */
    public class C19702a extends bj2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f159457a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f159458b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ h7e f159459c;

        public C19702a(String str, String str2, h7e h7eVar) {
            this.f159457a = str;
            this.f159458b = str2;
            this.f159459c = h7eVar;
        }

        @Override // p149l.bj2, p149l.h7e
        /* JADX INFO: renamed from: a */
        public void mo74248a(@NonNull File file) throws Throwable {
            super.mo74248a(file);
            File file2 = new File(rhn0.this.m179440h());
            if (!file2.exists()) {
                file2.getParentFile().mkdir();
                file2.mkdir();
            }
            File file3 = new File(rhn0.this.m179440h(), this.f159457a + "." + this.f159458b);
            boolean zM202930i = wet.m202930i(file, file3);
            qhi.m174545f(file);
            hfw.m130790a("[voice][ktv]", "unzip:" + zM202930i + ",path:" + file.getAbsolutePath());
            if (!zM202930i || !file3.exists()) {
                qhi.m174545f(file3);
                h7e h7eVar = this.f159459c;
                if (h7eVar != null) {
                    h7eVar.onFailed("unzip fail");
                    return;
                }
                return;
            }
            h7e h7eVar2 = this.f159459c;
            if (h7eVar2 != null) {
                h7eVar2.mo74248a(new File(rhn0.this.m179440h(), this.f159457a + "." + this.f159458b));
            }
        }

        @Override // p149l.bj2, p149l.h7e
        public void onFailed(@NonNull String str) {
            super.onFailed(str);
            h7e h7eVar = this.f159459c;
            if (h7eVar != null) {
                h7eVar.onFailed(str);
            }
        }
    }

    /* JADX INFO: renamed from: l.rhn0$b */
    public class C19703b extends bj2 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ h7e f159461a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f159462b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f159463c;

        public C19703b(h7e h7eVar, String str, String str2) {
            this.f159461a = h7eVar;
            this.f159462b = str;
            this.f159463c = str2;
        }

        @Override // p149l.bj2, p149l.h7e
        /* JADX INFO: renamed from: a */
        public void mo74248a(@NonNull File file) {
            super.mo74248a(file);
            h7e h7eVar = this.f159461a;
            if (h7eVar != null) {
                h7eVar.mo74248a(new File(rhn0.this.m179440h(), this.f159462b + "." + this.f159463c));
            }
        }

        @Override // p149l.bj2, p149l.h7e
        public void onFailed(@NonNull String str) {
            super.onFailed(str);
            h7e h7eVar = this.f159461a;
            if (h7eVar != null) {
                h7eVar.onFailed(str);
            }
        }
    }

    /* JADX INFO: renamed from: l.rhn0$c */
    public static class C19704c {
        private static final rhn0 INSTANCE = new rhn0();
    }

    public rhn0() {
        this.f159455a = "voiceKtv";
        this.f159456b = "lrc";
    }

    /* JADX INFO: renamed from: g */
    public static rhn0 m179435g() {
        return C19704c.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public void m179436c() {
        qhi.m174545f(new File(ypv.f199497e.getFilesDir(), "voiceKtv"));
    }

    /* JADX INFO: renamed from: d */
    public void m179437d(String str) {
        qhi.m174545f(new File("voiceKtv", str));
    }

    /* JADX INFO: renamed from: e */
    public final void m179438e(String str, String str2, String str3, h7e h7eVar) {
        m7s.m153386B().m153415z(new q7e.C19441a(str2, m179443k() + File.separator + str + ".zip").m173256i(Priority.get("IMMEDIATE")).m173248a(), new C19702a(str, str3, h7eVar));
    }

    /* JADX INFO: renamed from: f */
    public final void m179439f(String str, String str2, String str3, h7e h7eVar) {
        m7s.m153386B().m153415z(new q7e.C19441a(str2, m179440h() + File.separator + str + ".lrc").m173256i(Priority.get("IMMEDIATE")).m173248a(), new C19703b(h7eVar, str, str3));
    }

    /* JADX INFO: renamed from: h */
    public final String m179440h() {
        return m179443k() + File.separator + "lrc";
    }

    /* JADX INFO: renamed from: i */
    public void m179441i(String str, String str2, String str3, String str4, h7e h7eVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            h7eVar.onFailed("invalid lrc param");
            hfw.m130790a("[voice][ktv]", "getLrcFile invalid param");
            return;
        }
        if (!TextUtils.isEmpty(str4)) {
            hfw.m130790a("[voice][ktv]", "getLrcFile provider:" + str4);
        }
        if (!m179446n(str, str3)) {
            hfw.m130790a("[voice][ktv]", "getLrcFile download:" + str + Constants.SEPARATOR_COMMA + str3 + Constants.SEPARATOR_COMMA + str2);
            if (!x4s.f191056d.equals(str4) || str2.endsWith("zip")) {
                m179438e(str, str2, str3, h7eVar);
                return;
            } else {
                m179439f(str, str2, str3, h7eVar);
                return;
            }
        }
        if (h7eVar != null) {
            hfw.m130790a("[voice][ktv]", "getLrcFile exist:" + str + "." + str3);
            h7eVar.mo74248a(new File(m179440h() + File.separator + str + "." + str3));
        }
    }

    /* JADX INFO: renamed from: j */
    public String m179442j(String str, String str2) {
        return m179440h() + File.separator + str + "." + str2;
    }

    /* JADX INFO: renamed from: k */
    public String m179443k() {
        return ypv.f199497e.getFilesDir() + File.separator + "voiceKtv";
    }

    /* JADX INFO: renamed from: l */
    public String m179444l(String str) {
        return m179443k() + File.separator + str;
    }

    /* JADX INFO: renamed from: m */
    public void m179445m(final String str, String str2, h7e h7eVar) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            h7eVar.onFailed("invalid song param");
            hfw.m130790a("[voice][ktv]", "getSongFile invalid param");
            return;
        }
        if (!m179447o(str)) {
            hfw.m130790a("[voice][ktv]", "getSongFile download:" + str + "，" + str2);
            m7s.m153386B().m153415z(new q7e.C19441a(str2, m179443k() + File.separator + mqi0.m155944o()).m173256i(Priority.get("IMMEDIATE")).m173255h(new x9j() { // from class: l.qhn0
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return this.f154478a.m179448p(str, (String) obj, (File) obj2);
                }
            }).m173248a(), h7eVar);
            return;
        }
        if (h7eVar != null) {
            hfw.m130790a("[voice][ktv]", "getSongFile exist:" + str + Constants.SEPARATOR_COMMA + str2);
            h7eVar.mo74248a(new File(m179443k() + File.separator + str));
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m179446n(String str, String str2) {
        return qhi.m174551l(m179440h() + File.separator + str + "." + str2);
    }

    /* JADX INFO: renamed from: o */
    public boolean m179447o(String str) {
        return qhi.m174551l(m179443k() + File.separator + str);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ File m179448p(String str, String str2, File file) {
        File file2 = new File(m179443k(), str);
        return file.renameTo(file2) ? file2 : file;
    }
}
