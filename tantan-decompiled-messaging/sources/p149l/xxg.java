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
public class xxg extends PopupWindow {
    public xxg(final zzl zzlVar, Context context) {
        super(-1, -2);
        View viewInflate = LayoutInflater.from(context).inflate(o6c0.f142237m0, (ViewGroup) null);
        setContentView(viewInflate);
        final VLinear vLinear = (VLinear) viewInflate.findViewById(b5c0.f73465A1);
        ((VText) viewInflate.findViewById(b5c0.f73475E)).setText(fm20.m122134q());
        m211483c(vLinear);
        for (final int i = 0; i < vLinear.getChildCount(); i++) {
            final VText vText = (VText) vLinear.getChildAt(i);
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.vxg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f183446a.m211486f(vText, zzlVar, vLinear, i, view);
                }
            });
        }
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(a8c0.f68031t);
        setBackgroundDrawable(context.getResources().getDrawable(f3c0.f94351I6));
        xdl0.m208329E0(viewInflate.findViewById(b5c0.f73499M), new View.OnClickListener() { // from class: l.wxg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188479a.m211487g(view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m211483c(VLinear vLinear) {
        String str = FeedModule.f38855d.f192994I1;
        if (TextUtils.equals(str, "follow")) {
            m211488h(vLinear, 1);
            zvf0.m220368A("e_type_popup", m211485e(), vwb.m200311Y("sort_type", "follow"));
            zvf0.m220368A("e_type_popup", m211485e(), vwb.m200311Y("sort_type", "dating"));
        } else if (TextUtils.equals(str, "dating")) {
            m211488h(vLinear, 0);
            zvf0.m220368A("e_type_popup", m211485e(), vwb.m200311Y("sort_type", "follow"));
            zvf0.m220368A("e_type_popup", m211485e(), vwb.m200311Y("sort_type", "dating"));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m211484d(zzl zzlVar, VLinear vLinear, int i) {
        int i2 = 0;
        while (i2 < vLinear.getChildCount()) {
            VText vText = (VText) vLinear.getChildAt(i2);
            if (i2 == i) {
                String string = vText.getText().toString();
                if (TextUtils.equals(string, "关注")) {
                    zvf0.m220399u("e_type_popup", m211485e(), vwb.m200311Y("sort_type", "follow"));
                    FeedModule.f38855d.f192994I1 = "follow";
                } else if (TextUtils.equals(string, fm20.m122134q())) {
                    zvf0.m220399u("e_type_popup", m211485e(), vwb.m200311Y("sort_type", "dating"));
                    FeedModule.f38855d.f192994I1 = "dating";
                }
                zzlVar.mo63792j0();
            }
            vText.setSelected(i2 == i);
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m211485e() {
        String str = FeedModule.f38855d.f192994I1;
        if (TextUtils.equals(str, "follow")) {
            return "p_follow";
        }
        TextUtils.equals(str, "dating");
        return "p_discover_dating";
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m211486f(VText vText, zzl zzlVar, VLinear vLinear, int i, View view) {
        if (vText.isSelected()) {
            dismiss();
        } else if (zzlVar.mo63757P0()) {
            dismiss();
        } else {
            m211484d(zzlVar, vLinear, i);
            dismiss();
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m211487g(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: h */
    public final void m211488h(VLinear vLinear, int i) {
        int i2 = 0;
        while (i2 < vLinear.getChildCount()) {
            vLinear.getChildAt(i2).setSelected(i == i2);
            i2++;
        }
    }
}
