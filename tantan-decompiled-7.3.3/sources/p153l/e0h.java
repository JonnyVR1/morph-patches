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
import com.p051p1.mobile.putong.feed.data.FeedSelectParams;
import java.util.List;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class e0h extends PopupWindow {
    public e0h(final VImage vImage, Context context, final List<FeedSelectParams> list, String str, final y20<String> y20Var) {
        super(-2, -2);
        FeedModule.m61406H().mo31800mm(vImage, true);
        ViewGroup viewGroup = null;
        View viewInflate = LayoutInflater.from(context).inflate(tec0.f173653e3, (ViewGroup) null);
        setContentView(viewInflate);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(hdc0.f108821B1);
        FrameLayout frameLayout2 = (FrameLayout) viewInflate.findViewById(hdc0.f108879V);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(hdc0.f108980z);
        bnl0.m105509E0(frameLayout2, new View.OnClickListener() { // from class: l.b0h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74272a.m118865f(view);
            }
        });
        int iM118863d = m118863d(list);
        final int i = 0;
        while (i < list.size()) {
            String str2 = list.get(i).name;
            View viewInflate2 = LayoutInflater.from(context).inflate(tec0.f173646d3, viewGroup);
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate2.findViewById(hdc0.f108874T0);
            VText vText = (VText) viewInflate2.findViewById(hdc0.f108877U0);
            VImage vImage2 = (VImage) viewInflate2.findViewById(hdc0.f108871S0);
            if (iM118863d == i) {
                float fMeasureText = vText.getPaint().measureText(str2);
                fMeasureText = fMeasureText > ((float) qa00.m175859d(112.0f)) ? qa00.m175859d(112.0f) : fMeasureText;
                int iM175859d = qa00.m175859d(161.0f);
                int iM175859d2 = (int) (qa00.m175859d(20.0f) + fMeasureText + qa00.m175859d(12.0f) + qa00.m175859d(16.0f) + qa00.m175859d(12.0f));
                if (iM175859d > iM175859d2) {
                    bnl0.m105552e0(frameLayout, frameLayout.getPaddingRight() + qa00.m175859d(10.0f));
                    iM175859d2 += qa00.m175859d(10.0f);
                }
                bnl0.m105507D0(iM175859d2, frameLayout);
            }
            vText.getPaint().setFakeBoldText(TextUtils.equals(str, list.get(i).param));
            vText.setText(str2);
            vText.setTextColor(TextUtils.equals(str, list.get(i).param) ? context.getResources().getColor(k9c0.f124521n) : context.getResources().getColor(k9c0.f124503e));
            bnl0.m105524M(vImage2, TextUtils.equals(str, list.get(i).param));
            bnl0.m105509E0(constraintLayout, new View.OnClickListener() { // from class: l.c0h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79270a.m118866g(list, i, y20Var, view);
                }
            });
            linearLayout.addView(viewInflate2);
            i++;
            viewGroup = null;
        }
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.d0h
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
    public int m118863d(List<FeedSelectParams> list) {
        int i = 0;
        int length = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2).name;
            if (str.length() > length) {
                length = str.length();
                i = i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: e */
    public final String m118864e() {
        return "p_discover_dating";
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m118865f(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m118866g(List list, int i, y20 y20Var, View view) {
        i4g0.m138523u("e_select", m118864e(), jyb.m147494Y("selectchoice", ((FeedSelectParams) list.get(i)).param));
        y20Var.call(((FeedSelectParams) list.get(i)).param);
        dismiss();
    }
}
