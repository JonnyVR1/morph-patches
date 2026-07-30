package com.p051p1.mobile.putong.core.p058ui.quickaudio.party;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.QuickChatPartyInvitation;
import java.util.Calendar;
import p151v.VDraweeView;
import p151v.VText;
import p153l.hc1;
import p153l.l51;
import p153l.pzi0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class AudioQuickChatPartyJoinInDialogView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AudioQuickChatPartyJoinInDialogView f36242a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f36243b;

    /* JADX INFO: renamed from: c */
    public VText f36244c;

    /* JADX INFO: renamed from: d */
    public VText f36245d;

    /* JADX INFO: renamed from: e */
    public View f36246e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f36247f;

    /* JADX INFO: renamed from: g */
    public VText f36248g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f36249h;

    /* JADX INFO: renamed from: i */
    public VText f36250i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f36251j;

    /* JADX INFO: renamed from: k */
    public VText f36252k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f36253l;

    /* JADX INFO: renamed from: m */
    public VText f36254m;

    /* JADX INFO: renamed from: n */
    public long f36255n;

    /* JADX INFO: renamed from: o */
    public Act f36256o;

    /* JADX INFO: renamed from: p */
    public Runnable f36257p;

    public AudioQuickChatPartyJoinInDialogView(@NonNull Context context) {
        super(context);
        this.f36255n = 0L;
        this.f36257p = new Runnable() { // from class: l.gc1
            @Override // java.lang.Runnable
            public final void run() {
                this.f103516a.m55732f();
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public final void m55728b(View view) {
        hc1.m134442a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m55729c(QuickChatPartyInvitation quickChatPartyInvitation) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(pzi0.m174454o());
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
        this.f36255n = calendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: d */
    public final String m55730d(QuickChatPartyInvitation quickChatPartyInvitation) {
        StringBuilder sb = new StringBuilder();
        sb.append(m55731e(quickChatPartyInvitation.weekDay));
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
    public final String m55731e(int i) {
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
    public final String m55733g(int i) {
        if (i > 9) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            return sb.toString();
        }
        return "0" + i;
    }

    /* JADX INFO: renamed from: h */
    public void m55734h(Act act, QuickChatPartyInvitation quickChatPartyInvitation) {
        this.f36256o = act;
        if (quickChatPartyInvitation != null && quickChatPartyInvitation.isValueAvailable()) {
            m55729c(quickChatPartyInvitation);
            this.f36245d.setText(m55730d(quickChatPartyInvitation));
            m55732f();
        } else {
            this.f36245d.setText("来探探一起狂欢");
            this.f36248g.setText("00");
            this.f36250i.setText("00");
            this.f36252k.setText("00");
            this.f36254m.setText("00");
        }
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void m55732f() {
        if (this.f36256o == null) {
            return;
        }
        boolean zM55736j = m55736j();
        l51.m152890J(this.f36257p);
        if (zM55736j) {
            l51.m152888H(this.f36256o, this.f36257p, 1000L);
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m55736j() {
        long jM174454o = this.f36255n - pzi0.m174454o();
        VText vText = this.f36248g;
        if (jM174454o <= 0) {
            vText.setText("00");
            this.f36250i.setText("00");
            this.f36252k.setText("00");
            this.f36254m.setText("00");
            return false;
        }
        int i = (int) (jM174454o / 86400000);
        long j = jM174454o % 86400000;
        int i2 = (int) (j / 3600000);
        long j2 = j % 3600000;
        int i3 = (int) (j2 / Constants.ONE_MIN_IN_MILLIS);
        int i4 = (int) ((j2 % Constants.ONE_MIN_IN_MILLIS) / 1000);
        vText.setText(m55733g(i));
        this.f36250i.setText(m55733g(i2));
        this.f36252k.setText(m55733g(i3));
        this.f36254m.setText(m55733g(i4));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l51.m152890J(this.f36257p);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55728b(this);
        this.f36244c.setTypeface(Typeface.defaultFromStyle(1));
        uqb0.f180374G.m127109I0(this.f36243b, "https://static.tancdn.com/pe-webplatform/wH-BsXNh8BlNE72fbttvnoh-.webp", qa00.m175859d(175.0f), qa00.m175859d(175.0f));
    }

    public AudioQuickChatPartyJoinInDialogView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36255n = 0L;
        this.f36257p = new Runnable() { // from class: l.gc1
            @Override // java.lang.Runnable
            public final void run() {
                this.f103516a.m55732f();
            }
        };
    }

    public AudioQuickChatPartyJoinInDialogView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36255n = 0L;
        this.f36257p = new Runnable() { // from class: l.gc1
            @Override // java.lang.Runnable
            public final void run() {
                this.f103516a.m55732f();
            }
        };
    }
}
