package p153l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowView;
import com.p051p1.mobile.putong.data.Tag;
import com.p051p1.mobile.putong.data.User;
import p151v.VLinear_Dividers;
import p151v.VText;
import p151v.VText_Tags;

/* JADX INFO: loaded from: classes4.dex */
public class y1b0 extends g2b0 {

    /* JADX INFO: renamed from: A */
    public FlowView f197089A;

    /* JADX INFO: renamed from: y */
    public VText f197090y;

    /* JADX INFO: renamed from: z */
    public ImageView f197091z;

    public y1b0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    @Override // p153l.g2b0, p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f197090y.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // p153l.g2b0, p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewInflate = mo53983O().mo146493H2().inflate(kec0.f125491Ka, viewGroup, false);
        this.f101819u = (VLinear_Dividers) viewInflate.findViewById(adc0.f70625w9);
        this.f101821w = (VText_Tags) viewInflate.findViewById(adc0.f70608v9);
        VText vText = (VText) viewInflate.findViewById(adc0.f69966J8);
        this.f101820v = vText;
        this.f197090y = vText;
        this.f197091z = (ImageView) viewInflate.findViewById(adc0.f70642x9);
        this.f197089A = (FlowView) viewInflate.findViewById(adc0.f69937Hd);
        return viewInflate;
    }

    @Override // p153l.g2b0, p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        super.mo53914t();
        User userMo52252K2 = mo53983O().mo52252K2();
        final User userMo53478me = mo53983O().mo53478me();
        if (userMo52252K2 == null || userMo53478me == null) {
            return;
        }
        if (mo53983O().mo52258P1()) {
            this.f197091z.setImageResource(dbc0.f86608Tn);
            return;
        }
        boolean zM147479J = jyb.m147479J(jyb.m147522n(userMo52252K2.profile.tags, new qcj() { // from class: l.x1b0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Tag tag = (Tag) obj;
                return Boolean.valueOf(userMo53478me.profile.tags.contains(tag) && TextUtils.equals(tag.category, "personality"));
            }
        }));
        ImageView imageView = this.f197091z;
        if (zM147479J) {
            imageView.setImageResource(dbc0.f86608Tn);
        } else {
            imageView.setImageResource(dbc0.f86576Sn);
        }
    }
}
