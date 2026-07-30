package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.p046p1.mobile.putong.feed.FeedModule;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class dah extends PopupWindow {
    public dah(final zzl zzlVar, Context context, final d30 d30Var) {
        super(-1, -2);
        View viewInflate = LayoutInflater.from(context).inflate(o6c0.f142141Y0, (ViewGroup) null);
        setContentView(viewInflate);
        final VLinear vLinear = (VLinear) viewInflate.findViewById(b5c0.f73465A1);
        m110607c(vLinear);
        for (final int i = 0; i < vLinear.getChildCount(); i++) {
            final VText vText = (VText) vLinear.getChildAt(i);
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.bah
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f74682a.m110609e(vText, zzlVar, vLinear, i, d30Var, view);
                }
            });
        }
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(a8c0.f68031t);
        setBackgroundDrawable(context.getResources().getDrawable(f3c0.f94351I6));
        xdl0.m208329E0(viewInflate.findViewById(b5c0.f73499M), new View.OnClickListener() { // from class: l.cah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80032a.m110610f(view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m110607c(VLinear vLinear) {
        String str = FeedModule.f38855d.f192988G1;
        if (TextUtils.equals(str, "recommend")) {
            m110611g(vLinear, 0);
            zvf0.m220368A("e_type_popup", "p_like", vwb.m200311Y("sort_type", "recommend"));
        } else if (TextUtils.equals(str, "latest")) {
            m110611g(vLinear, 1);
            zvf0.m220368A("e_type_popup", "p_like", vwb.m200311Y("sort_type", "timeline"));
        } else if (TextUtils.equals(str, "match")) {
            m110611g(vLinear, 2);
            zvf0.m220368A("e_type_popup", "p_like", vwb.m200311Y("sort_type", "match"));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m110608d(VLinear vLinear, int i) {
        int i2 = 0;
        while (i2 < vLinear.getChildCount()) {
            VText vText = (VText) vLinear.getChildAt(i2);
            if (i2 == i) {
                String string = vText.getText().toString();
                if (TextUtils.equals(string, "推荐")) {
                    zvf0.m220399u("e_type_popup", "p_like", vwb.m200311Y("sort_type", "recommend"));
                    FeedModule.f38855d.f192988G1 = "recommend";
                } else if (TextUtils.equals(string, "最新")) {
                    zvf0.m220399u("e_type_popup", "p_like", vwb.m200311Y("sort_type", "timeline"));
                    FeedModule.f38855d.f192988G1 = "latest";
                } else if (TextUtils.equals(string, "配对")) {
                    zvf0.m220399u("e_type_popup", "p_like", vwb.m200311Y("sort_type", "match"));
                    FeedModule.f38855d.f192988G1 = "match";
                }
            }
            vText.setSelected(i2 == i);
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m110609e(VText vText, zzl zzlVar, VLinear vLinear, int i, d30 d30Var, View view) {
        if (vText.isSelected()) {
            dismiss();
        } else {
            if (zzlVar.mo63757P0()) {
                dismiss();
                return;
            }
            m110608d(vLinear, i);
            d30Var.call();
            dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m110610f(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: g */
    public final void m110611g(VLinear vLinear, int i) {
        int i2 = 0;
        while (i2 < vLinear.getChildCount()) {
            vLinear.getChildAt(i2).setSelected(i == i2);
            i2++;
        }
    }
}
