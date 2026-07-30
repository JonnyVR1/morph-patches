package p149l;

import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;

/* JADX INFO: loaded from: classes11.dex */
public class iti {

    /* JADX INFO: renamed from: a */
    public String f114884a;

    /* JADX INFO: renamed from: b */
    public String f114885b;

    /* JADX INFO: renamed from: c */
    public q860<Media> f114886c;

    /* JADX INFO: renamed from: d */
    public int f114887d;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Media m138199a(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: b */
    public static <T extends Media> iti m138200b(nuh0<File, T> nuh0Var) {
        iti itiVar = new iti();
        if (NullChecker.m81303a(nuh0Var.f140627a)) {
            itiVar.f114884a = nuh0Var.f140627a.getName();
            itiVar.f114885b = nuh0Var.f140627a.getPath();
        } else {
            itiVar.f114884a = "Unkown";
            itiVar.f114885b = "";
            CrashHelper.m81296c(new Exception("MediaPickerBaseAct: can not find parent foler!!"));
        }
        itiVar.f114886c = new q860<>(vwb.m200303Q(nuh0Var.f140628b, new w9j() { // from class: l.hti
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return iti.m138199a((Media) obj);
            }
        }), null);
        itiVar.f114887d = nuh0Var.m161483a();
        return itiVar;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f114885b.equalsIgnoreCase(((iti) obj).f114885b);
        } catch (ClassCastException e) {
            CrashHelper.m81296c(e);
            return this == obj;
        }
    }
}
