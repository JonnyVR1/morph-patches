package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.FeedModule;
import java.util.List;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class m3h extends PopupWindow {
    public m3h(final VImage vImage, Context context, List<String> list, final String str, final e30<String> e30Var) {
        super(-2, -2);
        FeedModule.m60222H().mo30797mm(vImage, true);
        View viewInflate = LayoutInflater.from(context).inflate(o6c0.f142198g3, (ViewGroup) null);
        setContentView(viewInflate);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(b5c0.f73526V);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(b5c0.f73627z);
        xdl0.m208329E0(frameLayout, new View.OnClickListener() { // from class: l.j3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116072a.m152912d(view);
            }
        });
        for (int i = 0; i < list.size(); i++) {
            final String str2 = list.get(i);
            View viewInflate2 = LayoutInflater.from(context).inflate(o6c0.f142191f3, (ViewGroup) null);
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate2.findViewById(b5c0.f73521T0);
            VText vText = (VText) viewInflate2.findViewById(b5c0.f73524U0);
            VImage vImage2 = (VImage) viewInflate2.findViewById(b5c0.f73518S0);
            vText.getPaint().setFakeBoldText(TextUtils.equals(str, str2));
            vText.setText(str2);
            vText.setTextColor(TextUtils.equals(str, str2) ? context.getResources().getColor(e1c0.f88798n) : context.getResources().getColor(e1c0.f88780e));
            xdl0.m208344M(vImage2, TextUtils.equals(str, str2));
            xdl0.m208329E0(constraintLayout, new View.OnClickListener() { // from class: l.k3h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f120837a.m152913e(str2, str, e30Var, view);
                }
            });
            viewInflate2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(viewInflate2);
        }
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.l3h
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                FeedModule.m60222H().mo30797mm(vImage, false);
            }
        });
        setOutsideTouchable(true);
        setTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(f3c0.f94351I6));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m152912d(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m152913e(String str, String str2, e30 e30Var, View view) {
        zvf0.m220399u("e_type_popup", "p_like", TextUtils.equals(str, fm20.m122126i()) ? vwb.m200311Y("sort_type", "like") : vwb.m200311Y("sort_type", "follow"));
        if (!TextUtils.equals(str2, str)) {
            e30Var.call(str);
        }
        dismiss();
    }
}
