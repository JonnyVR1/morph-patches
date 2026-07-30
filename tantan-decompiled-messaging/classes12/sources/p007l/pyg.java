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
import com.p000p1.mobile.putong.feed.data.FeedSelectParams;
import java.util.List;
import l.e30;
import l.j760;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class pyg extends PopupWindow {
    public pyg(final VImage vImage, Context context, final List<FeedSelectParams> list, String str, final e30<String> e30Var) {
        super(-2, -2);
        FeedModule.m1140H().mm(vImage, true);
        ViewGroup viewGroup = null;
        View viewInflate = LayoutInflater.from(context).inflate(o6c0.f11203e3, (ViewGroup) null);
        setContentView(viewInflate);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(b5c0.f5949B1);
        FrameLayout frameLayout2 = (FrameLayout) viewInflate.findViewById(b5c0.f6007V);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(b5c0.f6108z);
        xdl0.E0(frameLayout2, new View.OnClickListener() { // from class: l.myg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10602a.m13357f(view);
            }
        });
        int iM13355d = m13355d(list);
        final int i = 0;
        while (i < list.size()) {
            String str2 = list.get(i).name;
            View viewInflate2 = LayoutInflater.from(context).inflate(o6c0.f11196d3, viewGroup);
            ConstraintLayout constraintLayoutFindViewById = viewInflate2.findViewById(b5c0.f6002T0);
            VText vTextFindViewById = viewInflate2.findViewById(b5c0.f6005U0);
            VImage vImageFindViewById = viewInflate2.findViewById(b5c0.f5999S0);
            if (iM13355d == i) {
                float fMeasureText = vTextFindViewById.getPaint().measureText(str2);
                fMeasureText = fMeasureText > ((float) t100.d(112.0f)) ? t100.d(112.0f) : fMeasureText;
                int iD = t100.d(161.0f);
                int iD2 = (int) (t100.d(20.0f) + fMeasureText + t100.d(12.0f) + t100.d(16.0f) + t100.d(12.0f));
                if (iD > iD2) {
                    xdl0.e0(frameLayout, frameLayout.getPaddingRight() + t100.d(10.0f));
                    iD2 += t100.d(10.0f);
                }
                xdl0.D0(iD2, new View[]{frameLayout});
            }
            vTextFindViewById.getPaint().setFakeBoldText(TextUtils.equals(str, list.get(i).param));
            vTextFindViewById.setText(str2);
            vTextFindViewById.setTextColor(TextUtils.equals(str, list.get(i).param) ? context.getResources().getColor(e1c0.f7154n) : context.getResources().getColor(e1c0.f7136e));
            xdl0.M(vImageFindViewById, TextUtils.equals(str, list.get(i).param));
            xdl0.E0(constraintLayoutFindViewById, new View.OnClickListener() { // from class: l.nyg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10938a.m13358g(list, i, e30Var, view);
                }
            });
            linearLayout.addView(viewInflate2);
            i++;
            viewGroup = null;
        }
        setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.oyg
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
    public int m13355d(List<FeedSelectParams> list) {
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
    public final String m13356e() {
        return "p_discover_dating";
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m13357f(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m13358g(List list, int i, e30 e30Var, View view) {
        zvf0.u("e_select", m13356e(), new j760[]{vwb.Y("selectchoice", ((FeedSelectParams) list.get(i)).param)});
        e30Var.call(((FeedSelectParams) list.get(i)).param);
        dismiss();
    }
}
