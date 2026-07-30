package p007l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.FeedModule;
import java.util.List;
import l.e30;
import l.j760;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class m3h extends PopupWindow {
    public m3h(final VImage vImage, Context context, List<String> list, final String str, final e30<String> e30Var) {
        super(-2, -2);
        FeedModule.m1140H().mm(vImage, true);
        View viewInflate = LayoutInflater.from(context).inflate(o6c0.f11217g3, (ViewGroup) null);
        setContentView(viewInflate);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(b5c0.f6007V);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(b5c0.f6108z);
        xdl0.E0(frameLayout, new View.OnClickListener() { // from class: l.j3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9209a.m11751d(view);
            }
        });
        for (int i = 0; i < list.size(); i++) {
            final String str2 = list.get(i);
            View viewInflate2 = LayoutInflater.from(context).inflate(o6c0.f11210f3, (ViewGroup) null);
            ConstraintLayout constraintLayoutFindViewById = viewInflate2.findViewById(b5c0.f6002T0);
            VText vTextFindViewById = viewInflate2.findViewById(b5c0.f6005U0);
            VImage vImageFindViewById = viewInflate2.findViewById(b5c0.f5999S0);
            vTextFindViewById.getPaint().setFakeBoldText(TextUtils.equals(str, str2));
            vTextFindViewById.setText(str2);
            vTextFindViewById.setTextColor(TextUtils.equals(str, str2) ? context.getResources().getColor(e1c0.f7154n) : context.getResources().getColor(e1c0.f7136e));
            xdl0.M(vImageFindViewById, TextUtils.equals(str, str2));
            xdl0.E0(constraintLayoutFindViewById, new View.OnClickListener() { // from class: l.k3h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9582a.m11752e(str2, str, e30Var, view);
                }
            });
            viewInflate2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(viewInflate2);
        }
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.l3h
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                FeedModule.m1140H().mm(vImage, false);
            }
        });
        setOutsideTouchable(true);
        setTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(f3c0.f7634I6));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m11751d(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m11752e(String str, String str2, e30 e30Var, View view) {
        zvf0.u("e_type_popup", "p_like", new j760[]{TextUtils.equals(str, fm20.m10229i()) ? vwb.Y("sort_type", "like") : vwb.Y("sort_type", "follow")});
        if (!TextUtils.equals(str2, str)) {
            e30Var.call(str);
        }
        dismiss();
    }
}
