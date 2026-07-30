package p007l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.p000p1.mobile.putong.data.MomentNotifyBlockType;
import com.p000p1.mobile.putong.feed.FeedModule;
import l.d30;
import l.j760;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dah extends PopupWindow {
    public dah(final zzl zzlVar, Context context, final d30 d30Var) {
        super(-1, -2);
        View viewInflate = LayoutInflater.from(context).inflate(o6c0.f11160Y0, (ViewGroup) null);
        setContentView(viewInflate);
        final VLinear vLinear = (VLinear) viewInflate.findViewById(b5c0.f5946A1);
        m9359c(vLinear);
        for (final int i = 0; i < vLinear.getChildCount(); i++) {
            final VText childAt = vLinear.getChildAt(i);
            xdl0.E0(childAt, new View.OnClickListener() { // from class: l.bah
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f6205a.m9361e(childAt, zzlVar, vLinear, i, d30Var, view);
                }
            });
        }
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(a8c0.f5651t);
        setBackgroundDrawable(context.getResources().getDrawable(f3c0.f7634I6));
        xdl0.E0(viewInflate.findViewById(b5c0.f5980M), new View.OnClickListener() { // from class: l.cah
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6588a.m9362f(view);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m9359c(VLinear vLinear) {
        String str = FeedModule.f316d.f14923G1;
        if (TextUtils.equals(str, "recommend")) {
            m9363g(vLinear, 0);
            zvf0.A("e_type_popup", "p_like", new j760[]{vwb.Y("sort_type", "recommend")});
        } else if (TextUtils.equals(str, "latest")) {
            m9363g(vLinear, 1);
            zvf0.A("e_type_popup", "p_like", new j760[]{vwb.Y("sort_type", "timeline")});
        } else if (TextUtils.equals(str, MomentNotifyBlockType.match)) {
            m9363g(vLinear, 2);
            zvf0.A("e_type_popup", "p_like", new j760[]{vwb.Y("sort_type", MomentNotifyBlockType.match)});
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m9360d(VLinear vLinear, int i) {
        int i2 = 0;
        while (i2 < vLinear.getChildCount()) {
            VText childAt = vLinear.getChildAt(i2);
            if (i2 == i) {
                String string = childAt.getText().toString();
                if (TextUtils.equals(string, "推荐")) {
                    zvf0.u("e_type_popup", "p_like", new j760[]{vwb.Y("sort_type", "recommend")});
                    FeedModule.f316d.f14923G1 = "recommend";
                } else if (TextUtils.equals(string, "最新")) {
                    zvf0.u("e_type_popup", "p_like", new j760[]{vwb.Y("sort_type", "timeline")});
                    FeedModule.f316d.f14923G1 = "latest";
                } else if (TextUtils.equals(string, "配对")) {
                    zvf0.u("e_type_popup", "p_like", new j760[]{vwb.Y("sort_type", MomentNotifyBlockType.match)});
                    FeedModule.f316d.f14923G1 = MomentNotifyBlockType.match;
                }
            }
            childAt.setSelected(i2 == i);
            i2++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m9361e(VText vText, zzl zzlVar, VLinear vLinear, int i, d30 d30Var, View view) {
        if (vText.isSelected()) {
            dismiss();
        } else {
            if (zzlVar.mo4781P0()) {
                dismiss();
                return;
            }
            m9360d(vLinear, i);
            d30Var.call();
            dismiss();
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m9362f(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: g */
    public final void m9363g(VLinear vLinear, int i) {
        int i2 = 0;
        while (i2 < vLinear.getChildCount()) {
            vLinear.getChildAt(i2).setSelected(i == i2);
            i2++;
        }
    }
}
