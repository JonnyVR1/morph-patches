package p009l;

import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import l.nuh0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class iti {

    /* JADX INFO: renamed from: a */
    public String f14797a;

    /* JADX INFO: renamed from: b */
    public String f14798b;

    /* JADX INFO: renamed from: c */
    public q860<Media> f14799c;

    /* JADX INFO: renamed from: d */
    public int f14800d;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Media m16696a(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: b */
    public static <T extends Media> iti m16697b(nuh0<File, T> nuh0Var) {
        iti itiVar = new iti();
        if (NullChecker.a(nuh0Var.a)) {
            itiVar.f14797a = ((File) nuh0Var.a).getName();
            itiVar.f14798b = ((File) nuh0Var.a).getPath();
        } else {
            itiVar.f14797a = "Unkown";
            itiVar.f14798b = "";
            CrashHelper.c(new Exception("MediaPickerBaseAct: can not find parent foler!!"));
        }
        itiVar.f14799c = new q860<>(vwb.Q(nuh0Var.b, new w9j() { // from class: l.hti
            public final Object call(Object obj) {
                return iti.m16696a((Media) obj);
            }
        }), null);
        itiVar.f14800d = nuh0Var.a();
        return itiVar;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f14798b.equalsIgnoreCase(((iti) obj).f14798b);
        } catch (ClassCastException e) {
            CrashHelper.c(e);
            return this == obj;
        }
    }
}
