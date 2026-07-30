package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.p051p1.mobile.putong.feed.FeedModule;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class mzg extends PopupWindow {
    public mzg(final t2m t2mVar, Context context) {
        super(-1, -2);
        View viewInflate = LayoutInflater.from(context).inflate(tec0.f173706m0, (ViewGroup) null);
        setContentView(viewInflate);
        final VLinear vLinear = (VLinear) viewInflate.findViewById(hdc0.f108818A1);
        ((VText) viewInflate.findViewById(hdc0.f108828E)).setText(pu20.m173822q());
        m160903c(vLinear);
        for (final int i = 0; i < vLinear.getChildCount(); i++) {
            final VText vText = (VText) vLinear.getChildAt(i);
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.kzg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f129412a.m160906f(vText, t2mVar, vLinear, i, view);
                }
            });
        }
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(fgc0.f98917t);
        setBackgroundDrawable(context.getResources().getDrawable(lbc0.f130869I6));
        bnl0.m105509E0(viewInflate.findViewById(hdc0.f108852M), new View.OnClickListener() { // from class: l.lzg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134189a.m160907g(view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m160903c(VLinear vLinear) {
        String str = FeedModule.f39703d.f121304I1;
        if (TextUtils.equals(str, "follow")) {
            m160908h(vLinear, 1);
            i4g0.m138492A("e_type_popup", m160905e(), jyb.m147494Y("sort_type", "follow"));
            i4g0.m138492A("e_type_popup", m160905e(), jyb.m147494Y("sort_type", "dating"));
        } else if (TextUtils.equals(str, "dating")) {
            m160908h(vLinear, 0);
            i4g0.m138492A("e_type_popup", m160905e(), jyb.m147494Y("sort_type", "follow"));
            i4g0.m138492A("e_type_popup", m160905e(), jyb.m147494Y("sort_type", "dating"));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m160904d(t2m t2mVar, VLinear vLinear, int i) {
        int i2 = 0;
        while (i2 < vLinear.getChildCount()) {
            VText vText = (VText) vLinear.getChildAt(i2);
            if (i2 == i) {
                String string = vText.getText().toString();
                if (TextUtils.equals(string, "关注")) {
                    i4g0.m138523u("e_type_popup", m160905e(), jyb.m147494Y("sort_type", "follow"));
                    FeedModule.f39703d.f121304I1 = "follow";
                } else if (TextUtils.equals(string, pu20.m173822q())) {
                    i4g0.m138523u("e_type_popup", m160905e(), jyb.m147494Y("sort_type", "dating"));
                    FeedModule.f39703d.f121304I1 = "dating";
                }
                t2mVar.mo64975j0();
            }
            vText.setSelected(i2 == i);
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m160905e() {
        String str = FeedModule.f39703d.f121304I1;
        if (TextUtils.equals(str, "follow")) {
            return "p_follow";
        }
        TextUtils.equals(str, "dating");
        return "p_discover_dating";
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m160906f(VText vText, t2m t2mVar, VLinear vLinear, int i, View view) {
        if (vText.isSelected()) {
            dismiss();
        } else if (t2mVar.mo64940P0()) {
            dismiss();
        } else {
            m160904d(t2mVar, vLinear, i);
            dismiss();
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m160907g(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: h */
    public final void m160908h(VLinear vLinear, int i) {
        int i2 = 0;
        while (i2 < vLinear.getChildCount()) {
            vLinear.getChildAt(i2).setSelected(i == i2);
            i2++;
        }
    }
}
