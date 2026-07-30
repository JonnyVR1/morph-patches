package com.p046p1.mobile.putong.core.p053ui.quickaudio.party;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.QuickChatPartyInvitation;
import java.util.Calendar;
import p147v.VDraweeView;
import p147v.VText;
import p149l.ac1;
import p149l.e51;
import p149l.mqi0;
import p149l.qib0;
import p149l.t100;

/* JADX INFO: loaded from: classes9.dex */
public class AudioQuickChatPartyJoinInDialogView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AudioQuickChatPartyJoinInDialogView f35394a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f35395b;

    /* JADX INFO: renamed from: c */
    public VText f35396c;

    /* JADX INFO: renamed from: d */
    public VText f35397d;

    /* JADX INFO: renamed from: e */
    public View f35398e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f35399f;

    /* JADX INFO: renamed from: g */
    public VText f35400g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f35401h;

    /* JADX INFO: renamed from: i */
    public VText f35402i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f35403j;

    /* JADX INFO: renamed from: k */
    public VText f35404k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f35405l;

    /* JADX INFO: renamed from: m */
    public VText f35406m;

    /* JADX INFO: renamed from: n */
    public long f35407n;

    /* JADX INFO: renamed from: o */
    public Act f35408o;

    /* JADX INFO: renamed from: p */
    public Runnable f35409p;

    public AudioQuickChatPartyJoinInDialogView(@NonNull Context context) {
        super(context);
        this.f35407n = 0L;
        this.f35409p = new Runnable() { // from class: l.zb1
            @Override // java.lang.Runnable
            public final void run() {
                this.f202416a.m54549f();
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public final void m54545b(View view) {
        ac1.m95706a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m54546c(QuickChatPartyInvitation quickChatPartyInvitation) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.m155944o());
        int i = calendar.get(7) - 1;
        if (i == 0) {
            i = 7;
        }
        int i2 = quickChatPartyInvitation.weekDay;
        int i3 = (i2 != 0 ? i2 : 7) - i;
        if (i3 < 0) {
            i3 += 7;
        }
        if (quickChatPartyInvitation.beginHour == 24) {
            i3++;
        }
        calendar.add(5, i3);
        int i4 = quickChatPartyInvitation.beginHour;
        if (i4 == 24) {
            i4 = 0;
        }
        calendar.set(11, i4);
        calendar.set(12, 0);
        calendar.set(13, 0);
        this.f35407n = calendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: d */
    public final String m54547d(QuickChatPartyInvitation quickChatPartyInvitation) {
        StringBuilder sb = new StringBuilder();
        sb.append(m54548e(quickChatPartyInvitation.weekDay));
        int i = quickChatPartyInvitation.beginHour;
        if (i > 9) {
            sb.append(i);
        } else {
            sb.append(0);
            sb.append(quickChatPartyInvitation.beginHour);
        }
        sb.append(":00-");
        int i2 = quickChatPartyInvitation.endHour;
        if (i2 > 9) {
            sb.append(i2);
        } else {
            sb.append(0);
            sb.append(quickChatPartyInvitation.endHour);
        }
        sb.append(":00，来探探一起狂欢");
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public final String m54548e(int i) {
        switch (i) {
            case 0:
                return "星期日";
            case 1:
                return "星期一";
            case 2:
                return "星期二";
            case 3:
                return "星期三";
            case 4:
                return "星期四";
            case 5:
                return "星期五";
            case 6:
                return "星期六";
            case 7:
                return "星期日";
            default:
                return "本周";
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m54550g(int i) {
        if (i > 9) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            return sb.toString();
        }
        return "0" + i;
    }

    /* JADX INFO: renamed from: h */
    public void m54551h(Act act, QuickChatPartyInvitation quickChatPartyInvitation) {
        this.f35408o = act;
        if (quickChatPartyInvitation != null && quickChatPartyInvitation.isValueAvailable()) {
            m54546c(quickChatPartyInvitation);
            this.f35397d.setText(m54547d(quickChatPartyInvitation));
            m54549f();
        } else {
            this.f35397d.setText("来探探一起狂欢");
            this.f35400g.setText("00");
            this.f35402i.setText("00");
            this.f35404k.setText("00");
            this.f35406m.setText("00");
        }
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void m54549f() {
        if (this.f35408o == null) {
            return;
        }
        boolean zM54553j = m54553j();
        e51.m114745J(this.f35409p);
        if (zM54553j) {
            e51.m114743H(this.f35408o, this.f35409p, 1000L);
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m54553j() {
        long jM155944o = this.f35407n - mqi0.m155944o();
        VText vText = this.f35400g;
        if (jM155944o <= 0) {
            vText.setText("00");
            this.f35402i.setText("00");
            this.f35404k.setText("00");
            this.f35406m.setText("00");
            return false;
        }
        int i = (int) (jM155944o / 86400000);
        long j = jM155944o % 86400000;
        int i2 = (int) (j / 3600000);
        long j2 = j % 3600000;
        int i3 = (int) (j2 / Constants.ONE_MIN_IN_MILLIS);
        int i4 = (int) ((j2 % Constants.ONE_MIN_IN_MILLIS) / 1000);
        vText.setText(m54550g(i));
        this.f35402i.setText(m54550g(i2));
        this.f35404k.setText(m54550g(i3));
        this.f35406m.setText(m54550g(i4));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e51.m114745J(this.f35409p);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54545b(this);
        this.f35396c.setTypeface(Typeface.defaultFromStyle(1));
        qib0.f154691G.m102325I0(this.f35395b, "https://static.tancdn.com/pe-webplatform/wH-BsXNh8BlNE72fbttvnoh-.webp", t100.m186890d(175.0f), t100.m186890d(175.0f));
    }

    public AudioQuickChatPartyJoinInDialogView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35407n = 0L;
        this.f35409p = new Runnable() { // from class: l.zb1
            @Override // java.lang.Runnable
            public final void run() {
                this.f202416a.m54549f();
            }
        };
    }

    public AudioQuickChatPartyJoinInDialogView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35407n = 0L;
        this.f35409p = new Runnable() { // from class: l.zb1
            @Override // java.lang.Runnable
            public final void run() {
                this.f202416a.m54549f();
            }
        };
    }
}
