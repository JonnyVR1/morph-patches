package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.pushbubble.SimplePushBubble;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gd70 {

    /* JADX INFO: renamed from: c */
    public static int f102083c = 1;

    /* JADX INFO: renamed from: d */
    public static int f102084d = 2;

    /* JADX INFO: renamed from: e */
    public static int f102085e = 3;

    /* JADX INFO: renamed from: f */
    public static volatile gd70 f102086f;

    /* JADX INFO: renamed from: a */
    public ArrayList<WeakReference<Act>> f102087a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public Boolean f102088b = Boolean.FALSE;

    /* JADX INFO: renamed from: b */
    public static gd70 m125540b() {
        if (f102086f == null) {
            synchronized (gd70.class) {
                try {
                    if (f102086f == null) {
                        f102086f = new gd70();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f102086f;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m125541c(Act act, Integer num) {
        int i;
        int i2;
        if (this.f102088b.booleanValue() || act == null) {
            if (num.intValue() == f102083c) {
                i = R$string.f17893Kq;
            } else {
                i = num.intValue() == f102084d ? R$string.f17923Lq : R$string.f18414c5;
            }
            lsi0.m151593w(i);
            return;
        }
        if (this.f102087a.size() > 1) {
            ArrayList<WeakReference<Act>> arrayList = this.f102087a;
            arrayList.remove(arrayList.get(0));
        }
        LinearLayout linearLayout = new LinearLayout(act);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setGravity(16);
        linearLayout.setPadding(t100.m186890d(12.0f), t100.m186890d(12.0f), t100.m186890d(20.0f), t100.m186890d(12.0f));
        View vIcon = new VIcon(act);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.m186890d(28.0f), t100.m186890d(28.0f));
        layoutParams.rightMargin = t100.m186890d(8.0f);
        vIcon.setLayoutParams(layoutParams);
        vIcon.setBackgroundResource(x2c0.f189335Fl);
        linearLayout.addView(vIcon);
        VText vText = new VText(act);
        vText.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        vText.setTextColor(act.getResources().getColor(w0c0.f183854i));
        vText.setTextSize(15.0f);
        vText.setTypeface(eqh0.m117752c(3), 1);
        if (num.intValue() == f102083c) {
            i2 = R$string.f17893Kq;
        } else {
            i2 = num.intValue() == f102084d ? R$string.f17923Lq : R$string.f18414c5;
        }
        vText.setText(i2);
        if (num.intValue() != f102083c) {
            vText.setSingleLine(true);
            vText.setEllipsize(TextUtils.TruncateAt.END);
            vText.setMaxLines(1);
        }
        linearLayout.addView(vText);
        SimplePushBubble simplePushBubbleM21169s = new SimplePushBubble.C4372a(act, linearLayout).m21164B(num.intValue() == f102083c ? 2 : 1).m21169s();
        simplePushBubbleM21169s.m96808x(CorePopLevel.PIC_POST_SUCCESS);
        hdb0.m130575c().m130582i(simplePushBubbleM21169s);
        if (num.intValue() == f102083c) {
            CoreModule.m29934N().personalMediaMomentsFeedPrevious(CoreModule.m29931H().userId(), false, CoreMomentInfo.JSON_ADAPTER);
        }
        this.f102088b = Boolean.TRUE;
    }

    /* JADX INFO: renamed from: d */
    public boolean m125542d(final Act act) {
        act.duringCreated(wn90.m204602F().f187272d).subscribe(mkd0.m154955G(new e30() { // from class: l.fd70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f97016a.m125541c(act, (Integer) obj);
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public void m125543e(Boolean bool) {
        this.f102088b = bool;
    }
}
