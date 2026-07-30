package p007l;

import com.google.common.collect.Lists;
import com.p003p1.mobile.android.media.TTFFmpegCommand;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class rsf implements l7m {

    /* JADX INFO: renamed from: a */
    public String f4086a;

    public rsf(String str) {
        this.f4086a = str;
    }

    /* JADX INFO: renamed from: c */
    public static String m10603c(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 60;
        return (j3 / 60) + ":" + (j3 % 60) + ":" + (j2 % 60);
    }

    @Override // p007l.l7m
    /* JADX INFO: renamed from: a */
    public boolean mo9405a(String str, ds5 ds5Var, es5 es5Var, l7m.InterfaceC0598c interfaceC0598c, l7m.InterfaceC0599d interfaceC0599d, l7m.InterfaceC0596a interfaceC0596a, l7m.InterfaceC0597b interfaceC0597b) {
        return mo9406b(str, ds5Var, es5Var, new C0686a(interfaceC0597b, interfaceC0599d, interfaceC0598c, interfaceC0596a));
    }

    @Override // p007l.l7m
    /* JADX INFO: renamed from: b */
    public boolean mo9406b(String str, ds5 ds5Var, es5 es5Var, l7m.InterfaceC0600e interfaceC0600e) {
        if (interfaceC0600e != null) {
            try {
                try {
                    interfaceC0600e.mo9412a(this.f4086a, 1);
                } catch (TTFFmpegCommand.FFmpegCommandException e) {
                    if (interfaceC0600e != null) {
                        interfaceC0600e.mo9414c(e, str);
                    }
                    throw e;
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        long j = es5Var.f2638h;
        long j2 = es5Var.f2639i;
        ArrayList arrayListM = Lists.m(new String[]{"ffmpeg", "-probesize", "32M", "-analyzeduration", "10000000", "-i", this.f4086a, "-vf", "crop=" + es5Var.f2636f + ":" + es5Var.f2637g + ":" + es5Var.f2640j + ":" + es5Var.f2641k + ",scale=" + es5Var.f2634d + ":" + es5Var.f2635e, "-preset", "veryfast", "-tune", "fastdecode", "-tune", "zerolatency", "-y", "-c:v", "libx264", "-c:a", "aac", "-b:a", "48k", "-strict", "-2", "-metadata:s:v:0", "rotate=0"});
        if (j != -1 && j2 != -1) {
            arrayListM.add("-ss");
            arrayListM.add(m10603c(j));
            arrayListM.add("-t");
            arrayListM.add(m10603c(j2 - j));
        }
        arrayListM.add(str);
        arrayListM.toString();
        String[] strArr = new String[arrayListM.size()];
        arrayListM.toArray(strArr);
        TTFFmpegCommand.m1001a(strArr);
        if (interfaceC0600e == null) {
            return true;
        }
        try {
            interfaceC0600e.onSuccess(str);
            return true;
        } catch (Throwable unused2) {
            return true;
        }
    }

    /* JADX INFO: renamed from: l.rsf$a */
    public class C0686a implements l7m.InterfaceC0600e {
        public C0686a(l7m.InterfaceC0597b interfaceC0597b, l7m.InterfaceC0599d interfaceC0599d, l7m.InterfaceC0598c interfaceC0598c, l7m.InterfaceC0596a interfaceC0596a) {
        }

        @Override // p007l.l7m.InterfaceC0600e
        /* JADX INFO: renamed from: b */
        public void mo9413b(int i) {
        }

        @Override // p007l.l7m.InterfaceC0600e
        public void onSuccess(String str) {
        }

        @Override // p007l.l7m.InterfaceC0600e
        /* JADX INFO: renamed from: a */
        public void mo9412a(String str, int i) {
        }

        @Override // p007l.l7m.InterfaceC0600e
        /* JADX INFO: renamed from: c */
        public void mo9414c(Throwable th, String str) {
        }
    }
}
