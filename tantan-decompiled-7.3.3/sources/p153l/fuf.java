package p153l;

import com.google.common.collect.Lists;
import com.p051p1.mobile.android.media.TTFFmpegCommand;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class fuf implements bam {

    /* JADX INFO: renamed from: a */
    public String f100904a;

    public fuf(String str) {
        this.f100904a = str;
    }

    /* JADX INFO: renamed from: c */
    public static String m127458c(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 60;
        return (j3 / 60) + ":" + (j3 % 60) + ":" + (j2 % 60);
    }

    @Override // p153l.bam
    /* JADX INFO: renamed from: a */
    public boolean mo103215a(String str, ht5 ht5Var, it5 it5Var, bam.InterfaceC15957c interfaceC15957c, bam.InterfaceC15958d interfaceC15958d, bam.InterfaceC15955a interfaceC15955a, bam.InterfaceC15956b interfaceC15956b) {
        return mo103216b(str, ht5Var, it5Var, new C17078a(interfaceC15956b, interfaceC15958d, interfaceC15957c, interfaceC15955a));
    }

    @Override // p153l.bam
    /* JADX INFO: renamed from: b */
    public boolean mo103216b(String str, ht5 ht5Var, it5 it5Var, bam.InterfaceC15959e interfaceC15959e) {
        if (interfaceC15959e != null) {
            try {
                try {
                    interfaceC15959e.mo103217a(this.f100904a, 1);
                } catch (TTFFmpegCommand.FFmpegCommandException e) {
                    if (interfaceC15959e != null) {
                        interfaceC15959e.mo103219c(e, str);
                    }
                    throw e;
                }
            } catch (Throwable unused) {
                return false;
            }
        }
        long j = it5Var.f116796h;
        long j2 = it5Var.f116797i;
        ArrayList arrayListM15980m = Lists.m15980m("ffmpeg", "-probesize", "32M", "-analyzeduration", "10000000", "-i", this.f100904a, "-vf", "crop=" + it5Var.f116794f + ":" + it5Var.f116795g + ":" + it5Var.f116798j + ":" + it5Var.f116799k + ",scale=" + it5Var.f116792d + ":" + it5Var.f116793e, "-preset", "veryfast", "-tune", "fastdecode", "-tune", "zerolatency", "-y", "-c:v", "libx264", "-c:a", "aac", "-b:a", "48k", "-strict", "-2", "-metadata:s:v:0", "rotate=0");
        if (j != -1 && j2 != -1) {
            arrayListM15980m.add("-ss");
            arrayListM15980m.add(m127458c(j));
            arrayListM15980m.add("-t");
            arrayListM15980m.add(m127458c(j2 - j));
        }
        arrayListM15980m.add(str);
        arrayListM15980m.toString();
        String[] strArr = new String[arrayListM15980m.size()];
        arrayListM15980m.toArray(strArr);
        TTFFmpegCommand.m21729a(strArr);
        if (interfaceC15959e == null) {
            return true;
        }
        try {
            interfaceC15959e.onSuccess(str);
            return true;
        } catch (Throwable unused2) {
            return true;
        }
    }

    /* JADX INFO: renamed from: l.fuf$a */
    public class C17078a implements bam.InterfaceC15959e {
        public C17078a(bam.InterfaceC15956b interfaceC15956b, bam.InterfaceC15958d interfaceC15958d, bam.InterfaceC15957c interfaceC15957c, bam.InterfaceC15955a interfaceC15955a) {
        }

        @Override // p153l.bam.InterfaceC15959e
        /* JADX INFO: renamed from: b */
        public void mo103218b(int i) {
        }

        @Override // p153l.bam.InterfaceC15959e
        public void onSuccess(String str) {
        }

        @Override // p153l.bam.InterfaceC15959e
        /* JADX INFO: renamed from: a */
        public void mo103217a(String str, int i) {
        }

        @Override // p153l.bam.InterfaceC15959e
        /* JADX INFO: renamed from: c */
        public void mo103219c(Throwable th, String str) {
        }
    }
}
