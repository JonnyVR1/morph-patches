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
public class sbh extends PopupWindow {
    public sbh(final t2m t2mVar, Context context, final x20 x20Var) {
        super(-1, -2);
        View viewInflate = LayoutInflater.from(context).inflate(tec0.f173610Y0, (ViewGroup) null);
        setContentView(viewInflate);
        final VLinear vLinear = (VLinear) viewInflate.findViewById(hdc0.f108818A1);
        m185325c(vLinear);
        for (final int i = 0; i < vLinear.getChildCount(); i++) {
            final VText vText = (VText) vLinear.getChildAt(i);
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.qbh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f156476a.m185327e(vText, t2mVar, vLinear, i, x20Var, view);
                }
            });
        }
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(fgc0.f98917t);
        setBackgroundDrawable(context.getResources().getDrawable(lbc0.f130869I6));
        bnl0.m105509E0(viewInflate.findViewById(hdc0.f108852M), new View.OnClickListener() { // from class: l.rbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f162022a.m185328f(view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m185325c(VLinear vLinear) {
        String str = FeedModule.f39703d.f121298G1;
        if (TextUtils.equals(str, "recommend")) {
            m185329g(vLinear, 0);
            i4g0.m138492A("e_type_popup", "p_like", jyb.m147494Y("sort_type", "recommend"));
        } else if (TextUtils.equals(str, "latest")) {
            m185329g(vLinear, 1);
            i4g0.m138492A("e_type_popup", "p_like", jyb.m147494Y("sort_type", "timeline"));
        } else if (TextUtils.equals(str, "match")) {
            m185329g(vLinear, 2);
            i4g0.m138492A("e_type_popup", "p_like", jyb.m147494Y("sort_type", "match"));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m185326d(VLinear vLinear, int i) {
        int i2 = 0;
        while (i2 < vLinear.getChildCount()) {
            VText vText = (VText) vLinear.getChildAt(i2);
            if (i2 == i) {
                String string = vText.getText().toString();
                if (TextUtils.equals(string, "推荐")) {
                    i4g0.m138523u("e_type_popup", "p_like", jyb.m147494Y("sort_type", "recommend"));
                    FeedModule.f39703d.f121298G1 = "recommend";
                } else if (TextUtils.equals(string, "最新")) {
                    i4g0.m138523u("e_type_popup", "p_like", jyb.m147494Y("sort_type", "timeline"));
                    FeedModule.f39703d.f121298G1 = "latest";
                } else if (TextUtils.equals(string, "配对")) {
                    i4g0.m138523u("e_type_popup", "p_like", jyb.m147494Y("sort_type", "match"));
                    FeedModule.f39703d.f121298G1 = "match";
                }
            }
            vText.setSelected(i2 == i);
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m185327e(VText vText, t2m t2mVar, VLinear vLinear, int i, x20 x20Var, View view) {
        if (vText.isSelected()) {
            dismiss();
        } else {
            if (t2mVar.mo64940P0()) {
                dismiss();
                return;
            }
            m185326d(vLinear, i);
            x20Var.call();
            dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m185328f(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: g */
    public final void m185329g(VLinear vLinear, int i) {
        int i2 = 0;
        while (i2 < vLinear.getChildCount()) {
            vLinear.getChildAt(i2).setSelected(i == i2);
            i2++;
        }
    }
}
