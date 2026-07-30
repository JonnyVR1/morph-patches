package p149l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowView;
import com.p046p1.mobile.putong.data.Tag;
import com.p046p1.mobile.putong.data.User;
import p147v.VLinear_Dividers;
import p147v.VText;
import p147v.VText_Tags;

/* JADX INFO: loaded from: classes4.dex */
public class uta0 extends cua0 {

    /* JADX INFO: renamed from: A */
    public FlowView f178244A;

    /* JADX INFO: renamed from: y */
    public VText f178245y;

    /* JADX INFO: renamed from: z */
    public ImageView f178246z;

    public uta0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p149l.cua0, p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f178245y.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // p149l.cua0, p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewInflate = mo52800O().mo94568H2().inflate(f6c0.f95325Da, viewGroup, false);
        this.f82544u = (VLinear_Dividers) viewInflate.findViewById(u4c0.f174500u9);
        this.f82546w = (VText_Tags) viewInflate.findViewById(u4c0.f174483t9);
        VText vText = (VText) viewInflate.findViewById(u4c0.f173844H8);
        this.f82545v = vText;
        this.f178245y = vText;
        this.f178246z = (ImageView) viewInflate.findViewById(u4c0.f174517v9);
        this.f178244A = (FlowView) viewInflate.findViewById(u4c0.f173815Fd);
        return viewInflate;
    }

    @Override // p149l.cua0, p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        super.mo52731t();
        User userMo51069K2 = mo52800O().mo51069K2();
        final User userMo52295me = mo52800O().mo52295me();
        if (userMo51069K2 == null || userMo52295me == null) {
            return;
        }
        if (mo52800O().mo51075P1()) {
            this.f178246z.setImageResource(x2c0.f190148fn);
            return;
        }
        boolean zM200296J = vwb.m200296J(vwb.m200339n(userMo51069K2.profile.tags, new w9j() { // from class: l.tta0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo52295me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "personality"));
            }
        }));
        ImageView imageView = this.f178246z;
        if (zM200296J) {
            imageView.setImageResource(x2c0.f190148fn);
        } else {
            imageView.setImageResource(x2c0.f190116en);
        }
    }
}
