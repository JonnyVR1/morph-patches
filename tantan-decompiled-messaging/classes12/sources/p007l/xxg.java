package p007l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.p000p1.mobile.putong.feed.FeedModule;
import l.j760;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class xxg extends PopupWindow {
    public xxg(final zzl zzlVar, Context context) {
        super(-1, -2);
        View viewInflate = LayoutInflater.from(context).inflate(o6c0.f11256m0, (ViewGroup) null);
        setContentView(viewInflate);
        final VLinear vLinear = (VLinear) viewInflate.findViewById(b5c0.f5946A1);
        viewInflate.findViewById(b5c0.f5956E).setText(fm20.m10237q());
        m16868c(vLinear);
        for (final int i = 0; i < vLinear.getChildCount(); i++) {
            final VText childAt = vLinear.getChildAt(i);
            xdl0.E0(childAt, new View.OnClickListener() { // from class: l.vxg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14323a.m16871f(childAt, zzlVar, vLinear, i, view);
                }
            });
        }
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(a8c0.f5651t);
        setBackgroundDrawable(context.getResources().getDrawable(f3c0.f7634I6));
        xdl0.E0(viewInflate.findViewById(b5c0.f5980M), new View.OnClickListener() { // from class: l.wxg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14699a.m16872g(view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m16868c(VLinear vLinear) {
        String str = FeedModule.f316d.f14929I1;
        if (TextUtils.equals(str, "follow")) {
            m16873h(vLinear, 1);
            zvf0.A("e_type_popup", m16870e(), new j760[]{vwb.Y("sort_type", "follow")});
            zvf0.A("e_type_popup", m16870e(), new j760[]{vwb.Y("sort_type", "dating")});
        } else if (TextUtils.equals(str, "dating")) {
            m16873h(vLinear, 0);
            zvf0.A("e_type_popup", m16870e(), new j760[]{vwb.Y("sort_type", "follow")});
            zvf0.A("e_type_popup", m16870e(), new j760[]{vwb.Y("sort_type", "dating")});
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m16869d(zzl zzlVar, VLinear vLinear, int i) {
        int i2 = 0;
        while (i2 < vLinear.getChildCount()) {
            VText childAt = vLinear.getChildAt(i2);
            if (i2 == i) {
                String string = childAt.getText().toString();
                if (TextUtils.equals(string, "关注")) {
                    zvf0.u("e_type_popup", m16870e(), new j760[]{vwb.Y("sort_type", "follow")});
                    FeedModule.f316d.f14929I1 = "follow";
                } else if (TextUtils.equals(string, fm20.m10237q())) {
                    zvf0.u("e_type_popup", m16870e(), new j760[]{vwb.Y("sort_type", "dating")});
                    FeedModule.f316d.f14929I1 = "dating";
                }
                zzlVar.mo4818j0();
            }
            childAt.setSelected(i2 == i);
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m16870e() {
        String str = FeedModule.f316d.f14929I1;
        if (TextUtils.equals(str, "follow")) {
            return "p_follow";
        }
        TextUtils.equals(str, "dating");
        return "p_discover_dating";
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m16871f(VText vText, zzl zzlVar, VLinear vLinear, int i, View view) {
        if (vText.isSelected()) {
            dismiss();
        } else if (zzlVar.mo4781P0()) {
            dismiss();
        } else {
            m16869d(zzlVar, vLinear, i);
            dismiss();
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m16872g(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: h */
    public final void m16873h(VLinear vLinear, int i) {
        int i2 = 0;
        while (i2 < vLinear.getChildCount()) {
            vLinear.getChildAt(i2).setSelected(i == i2);
            i2++;
        }
    }
}
