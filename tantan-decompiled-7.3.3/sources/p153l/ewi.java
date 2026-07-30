package p153l;

import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class ewi {

    /* JADX INFO: renamed from: a */
    public String f96161a;

    /* JADX INFO: renamed from: b */
    public String f96162b;

    /* JADX INFO: renamed from: c */
    public vg60<Media> f96163c;

    /* JADX INFO: renamed from: d */
    public int f96164d;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Media m122952a(Media media) {
        return media;
    }

    /* JADX INFO: renamed from: b */
    public static <T extends Media> ewi m122953b(v2i0<File, T> v2i0Var) {
        ewi ewiVar = new ewi();
        if (NullChecker.m82486a(v2i0Var.f182094a)) {
            ewiVar.f96161a = v2i0Var.f182094a.getName();
            ewiVar.f96162b = v2i0Var.f182094a.getPath();
        } else {
            ewiVar.f96161a = "Unkown";
            ewiVar.f96162b = "";
            CrashHelper.m82479c(new Exception("MediaPickerBaseAct: can not find parent foler!!"));
        }
        ewiVar.f96163c = new vg60<>(jyb.m147486Q(v2i0Var.f182095b, new qcj() { // from class: l.dwi
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ewi.m122952a((Media) obj);
            }
        }), null);
        ewiVar.f96164d = v2i0Var.m199131a();
        return ewiVar;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f96162b.equalsIgnoreCase(((ewi) obj).f96162b);
        } catch (ClassCastException e) {
            CrashHelper.m82479c(e);
            return this == obj;
        }
    }
}
