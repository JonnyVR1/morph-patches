package p002l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.views.FlowView;
import com.p1.mobile.putong.data.Tag;
import com.p1.mobile.putong.data.User;
import l.f6c0;
import l.mcr;
import l.u4c0;
import l.vwb;
import l.w9j;
import l.x2c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class uta0 extends cua0 {

    /* JADX INFO: renamed from: A */
    public FlowView f20787A;

    /* JADX INFO: renamed from: y */
    public VText f20788y;

    /* JADX INFO: renamed from: z */
    public ImageView f20789z;

    public uta0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p002l.cua0, p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f20788y.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // p002l.cua0, p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View viewInflate = mo3351O().mo9267H2().inflate(f6c0.Da, viewGroup, false);
        this.f8940u = viewInflate.findViewById(u4c0.u9);
        this.f8942w = viewInflate.findViewById(u4c0.t9);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.H8);
        this.f8941v = vTextFindViewById;
        this.f20788y = vTextFindViewById;
        this.f20789z = (ImageView) viewInflate.findViewById(u4c0.v9);
        this.f20787A = (FlowView) viewInflate.findViewById(u4c0.Fd);
        return viewInflate;
    }

    @Override // p002l.cua0, p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        super.mo3282t();
        User userMo1517K2 = mo3351O().mo1517K2();
        final User userMo2827me = mo3351O().mo2827me();
        if (userMo1517K2 == null || userMo2827me == null) {
            return;
        }
        if (mo3351O().mo1523P1()) {
            this.f20789z.setImageResource(x2c0.fn);
            return;
        }
        boolean zJ = vwb.J(vwb.n(userMo1517K2.profile.tags, new w9j() { // from class: l.tta0
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo2827me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "personality"));
            }
        }));
        ImageView imageView = this.f20789z;
        if (zJ) {
            imageView.setImageResource(x2c0.fn);
        } else {
            imageView.setImageResource(x2c0.en);
        }
    }
}
