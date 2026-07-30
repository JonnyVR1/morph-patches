package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.FeedModule;
import java.util.List;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class b5h extends PopupWindow {
    public b5h(final VImage vImage, Context context, List<String> list, final String str, final y20<String> y20Var) {
        super(-2, -2);
        FeedModule.m61406H().mo31800mm(vImage, true);
        View viewInflate = LayoutInflater.from(context).inflate(tec0.f173667g3, (ViewGroup) null);
        setContentView(viewInflate);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(hdc0.f108879V);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(hdc0.f108980z);
        bnl0.m105509E0(frameLayout, new View.OnClickListener() { // from class: l.y4h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197468a.m102583d(view);
            }
        });
        for (int i = 0; i < list.size(); i++) {
            final String str2 = list.get(i);
            View viewInflate2 = LayoutInflater.from(context).inflate(tec0.f173660f3, (ViewGroup) null);
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate2.findViewById(hdc0.f108874T0);
            VText vText = (VText) viewInflate2.findViewById(hdc0.f108877U0);
            VImage vImage2 = (VImage) viewInflate2.findViewById(hdc0.f108871S0);
            vText.getPaint().setFakeBoldText(TextUtils.equals(str, str2));
            vText.setText(str2);
            vText.setTextColor(TextUtils.equals(str, str2) ? context.getResources().getColor(k9c0.f124521n) : context.getResources().getColor(k9c0.f124503e));
            bnl0.m105524M(vImage2, TextUtils.equals(str, str2));
            bnl0.m105509E0(constraintLayout, new View.OnClickListener() { // from class: l.z4h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f202955a.m102584e(str2, str, y20Var, view);
                }
            });
            viewInflate2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(viewInflate2);
        }
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.a5h
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                FeedModule.m61406H().mo31800mm(vImage, false);
            }
        });
        setOutsideTouchable(true);
        setTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(lbc0.f130869I6));
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m102583d(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m102584e(String str, String str2, y20 y20Var, View view) {
        i4g0.m138523u("e_type_popup", "p_like", TextUtils.equals(str, pu20.m173814i()) ? jyb.m147494Y("sort_type", "like") : jyb.m147494Y("sort_type", "follow"));
        if (!TextUtils.equals(str2, str)) {
            y20Var.call(str);
        }
        dismiss();
    }
}
