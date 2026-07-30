package p149l;

import com.google.common.collect.Lists;
import com.p046p1.mobile.android.media.TTFFmpegCommand;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class rsf implements l7m {

    /* JADX INFO: renamed from: a */
    public String f160850a;

    public rsf(String str) {
        this.f160850a = str;
    }

    /* JADX INFO: renamed from: c */
    public static String m180658c(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 60;
        return (j3 / 60) + ":" + (j3 % 60) + ":" + (j2 % 60);
    }

    @Override // p149l.l7m
    /* JADX INFO: renamed from: a */
    public boolean mo136481a(String str, ds5 ds5Var, es5 es5Var, l7m.InterfaceC18160c interfaceC18160c, l7m.InterfaceC18161d interfaceC18161d, l7m.InterfaceC18158a interfaceC18158a, l7m.InterfaceC18159b interfaceC18159b) {
        return mo136482b(str, ds5Var, es5Var, new C19771a(interfaceC18159b, interfaceC18161d, interfaceC18160c, interfaceC18158a));
    }

    @Override // p149l.l7m
    /* JADX INFO: renamed from: b */
    public boolean mo136482b(String str, ds5 ds5Var, es5 es5Var, l7m.InterfaceC18162e interfaceC18162e) {
        if (interfaceC18162e != null) {
            try {
                try {
                    interfaceC18162e.mo136488a(this.f160850a, 1);
                } catch (TTFFmpegCommand.FFmpegCommandException e) {
                    if (interfaceC18162e != null) {
                        interfaceC18162e.mo136490c(e, str);
                    }
                    throw e;
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        long j = es5Var.f92987h;
        long j2 = es5Var.f92988i;
        ArrayList arrayListM15926m = Lists.m15926m("ffmpeg", "-probesize", "32M", "-analyzeduration", "10000000", "-i", this.f160850a, "-vf", "crop=" + es5Var.f92985f + ":" + es5Var.f92986g + ":" + es5Var.f92989j + ":" + es5Var.f92990k + ",scale=" + es5Var.f92983d + ":" + es5Var.f92984e, "-preset", "veryfast", "-tune", "fastdecode", "-tune", "zerolatency", "-y", "-c:v", "libx264", "-c:a", "aac", "-b:a", "48k", "-strict", "-2", "-metadata:s:v:0", "rotate=0");
        if (j != -1 && j2 != -1) {
            arrayListM15926m.add("-ss");
            arrayListM15926m.add(m180658c(j));
            arrayListM15926m.add("-t");
            arrayListM15926m.add(m180658c(j2 - j));
        }
        arrayListM15926m.add(str);
        arrayListM15926m.toString();
        String[] strArr = new String[arrayListM15926m.size()];
        arrayListM15926m.toArray(strArr);
        TTFFmpegCommand.m20730a(strArr);
        if (interfaceC18162e == null) {
            return true;
        }
        try {
            interfaceC18162e.onSuccess(str);
            return true;
        } catch (Throwable unused2) {
            return true;
        }
    }

    /* JADX INFO: renamed from: l.rsf$a */
    public class C19771a implements l7m.InterfaceC18162e {
        public C19771a(l7m.InterfaceC18159b interfaceC18159b, l7m.InterfaceC18161d interfaceC18161d, l7m.InterfaceC18160c interfaceC18160c, l7m.InterfaceC18158a interfaceC18158a) {
        }

        @Override // p149l.l7m.InterfaceC18162e
        /* JADX INFO: renamed from: b */
        public void mo136489b(int i) {
        }

        @Override // p149l.l7m.InterfaceC18162e
        public void onSuccess(String str) {
        }

        @Override // p149l.l7m.InterfaceC18162e
        /* JADX INFO: renamed from: a */
        public void mo136488a(String str, int i) {
        }

        @Override // p149l.l7m.InterfaceC18162e
        /* JADX INFO: renamed from: c */
        public void mo136490c(Throwable th, String str) {
        }
    }
}
