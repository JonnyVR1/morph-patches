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
import com.p046p1.mobile.putong.feed.data.FeedSelectParams;
import java.util.List;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class pyg extends PopupWindow {
    public pyg(final VImage vImage, Context context, final List<FeedSelectParams> list, String str, final e30<String> e30Var) {
        super(-2, -2);
        FeedModule.m60222H().mo30797mm(vImage, true);
        ViewGroup viewGroup = null;
        View viewInflate = LayoutInflater.from(context).inflate(o6c0.f142184e3, (ViewGroup) null);
        setContentView(viewInflate);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(b5c0.f73468B1);
        FrameLayout frameLayout2 = (FrameLayout) viewInflate.findViewById(b5c0.f73526V);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(b5c0.f73627z);
        xdl0.m208329E0(frameLayout2, new View.OnClickListener() { // from class: l.myg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136298a.m172115f(view);
            }
        });
        int iM172113d = m172113d(list);
        final int i = 0;
        while (i < list.size()) {
            String str2 = list.get(i).name;
            View viewInflate2 = LayoutInflater.from(context).inflate(o6c0.f142177d3, viewGroup);
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate2.findViewById(b5c0.f73521T0);
            VText vText = (VText) viewInflate2.findViewById(b5c0.f73524U0);
            VImage vImage2 = (VImage) viewInflate2.findViewById(b5c0.f73518S0);
            if (iM172113d == i) {
                float fMeasureText = vText.getPaint().measureText(str2);
                fMeasureText = fMeasureText > ((float) t100.m186890d(112.0f)) ? t100.m186890d(112.0f) : fMeasureText;
                int iM186890d = t100.m186890d(161.0f);
                int iM186890d2 = (int) (t100.m186890d(20.0f) + fMeasureText + t100.m186890d(12.0f) + t100.m186890d(16.0f) + t100.m186890d(12.0f));
                if (iM186890d > iM186890d2) {
                    xdl0.m208372e0(frameLayout, frameLayout.getPaddingRight() + t100.m186890d(10.0f));
                    iM186890d2 += t100.m186890d(10.0f);
                }
                xdl0.m208327D0(iM186890d2, frameLayout);
            }
            vText.getPaint().setFakeBoldText(TextUtils.equals(str, list.get(i).param));
            vText.setText(str2);
            vText.setTextColor(TextUtils.equals(str, list.get(i).param) ? context.getResources().getColor(e1c0.f88798n) : context.getResources().getColor(e1c0.f88780e));
            xdl0.m208344M(vImage2, TextUtils.equals(str, list.get(i).param));
            xdl0.m208329E0(constraintLayout, new View.OnClickListener() { // from class: l.nyg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f141109a.m172116g(list, i, e30Var, view);
                }
            });
            linearLayout.addView(viewInflate2);
            i++;
            viewGroup = null;
        }
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.oyg
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
    public int m172113d(List<FeedSelectParams> list) {
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
    public final String m172114e() {
        return "p_discover_dating";
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m172115f(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m172116g(List list, int i, e30 e30Var, View view) {
        zvf0.m220399u("e_select", m172114e(), vwb.m200311Y("selectchoice", ((FeedSelectParams) list.get(i)).param));
        e30Var.call(((FeedSelectParams) list.get(i)).param);
        dismiss();
    }
}
