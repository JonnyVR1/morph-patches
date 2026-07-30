package com.p000p1.mobile.putong.core.p004ui.quickaudio.party;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.QuickChatPartyInvitation;
import java.util.Calendar;
import l.ac1;
import l.e51;
import l.mqi0;
import l.t100;
import p006l.qib0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AudioQuickChatPartyJoinInDialogView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public AudioQuickChatPartyJoinInDialogView f5175a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5176b;

    /* JADX INFO: renamed from: c */
    public VText f5177c;

    /* JADX INFO: renamed from: d */
    public VText f5178d;

    /* JADX INFO: renamed from: e */
    public View f5179e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f5180f;

    /* JADX INFO: renamed from: g */
    public VText f5181g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f5182h;

    /* JADX INFO: renamed from: i */
    public VText f5183i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f5184j;

    /* JADX INFO: renamed from: k */
    public VText f5185k;

    /* JADX INFO: renamed from: l */
    public RelativeLayout f5186l;

    /* JADX INFO: renamed from: m */
    public VText f5187m;

    /* JADX INFO: renamed from: n */
    public long f5188n;

    /* JADX INFO: renamed from: o */
    public Act f5189o;

    /* JADX INFO: renamed from: p */
    public Runnable f5190p;

    public AudioQuickChatPartyJoinInDialogView(@NonNull Context context) {
        super(context);
        this.f5188n = 0L;
        this.f5190p = new Runnable() { // from class: l.zb1
            @Override // java.lang.Runnable
            public final void run() {
                this.f28693a.m7892f();
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public final void m7888b(View view) {
        ac1.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final void m7889c(QuickChatPartyInvitation quickChatPartyInvitation) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(mqi0.o());
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
        this.f5188n = calendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: d */
    public final String m7890d(QuickChatPartyInvitation quickChatPartyInvitation) {
        StringBuilder sb = new StringBuilder();
        sb.append(m7891e(quickChatPartyInvitation.weekDay));
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
    public final String m7891e(int i) {
        switch (i) {
            case 0:
                return "星期日";
            case 1:
                return "星期一";
            case 2:
                return "星期二";
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return "星期三";
            case CameraSticker.STATE_ERROR /* 4 */:
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
    public final String m7893g(int i) {
        if (i > 9) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            return sb.toString();
        }
        return "0" + i;
    }

    /* JADX INFO: renamed from: h */
    public void m7894h(Act act, QuickChatPartyInvitation quickChatPartyInvitation) {
        this.f5189o = act;
        if (quickChatPartyInvitation != null && quickChatPartyInvitation.isValueAvailable()) {
            m7889c(quickChatPartyInvitation);
            this.f5178d.setText(m7890d(quickChatPartyInvitation));
            m7892f();
        } else {
            this.f5178d.setText("来探探一起狂欢");
            this.f5181g.setText("00");
            this.f5183i.setText("00");
            this.f5185k.setText("00");
            this.f5187m.setText("00");
        }
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void m7892f() {
        if (this.f5189o == null) {
            return;
        }
        boolean zM7896j = m7896j();
        e51.J(this.f5190p);
        if (zM7896j) {
            e51.H(this.f5189o, this.f5190p, 1000L);
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean m7896j() {
        long jO = this.f5188n - mqi0.o();
        VText vText = this.f5181g;
        if (jO <= 0) {
            vText.setText("00");
            this.f5183i.setText("00");
            this.f5185k.setText("00");
            this.f5187m.setText("00");
            return false;
        }
        int i = (int) (jO / 86400000);
        long j = jO % 86400000;
        int i2 = (int) (j / 3600000);
        long j2 = j % 3600000;
        vText.setText(m7893g(i));
        this.f5183i.setText(m7893g(i2));
        this.f5185k.setText(m7893g((int) (j2 / 60000)));
        this.f5187m.setText(m7893g((int) ((j2 % 60000) / 1000)));
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e51.J(this.f5190p);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7888b(this);
        this.f5177c.setTypeface(Typeface.defaultFromStyle(1));
        qib0.f19782G.m12738I0(this.f5176b, "https://static.tancdn.com/pe-webplatform/wH-BsXNh8BlNE72fbttvnoh-.webp", t100.d(175.0f), t100.d(175.0f));
    }

    public AudioQuickChatPartyJoinInDialogView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5188n = 0L;
        this.f5190p = new Runnable() { // from class: l.zb1
            @Override // java.lang.Runnable
            public final void run() {
                this.f28693a.m7892f();
            }
        };
    }

    public AudioQuickChatPartyJoinInDialogView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5188n = 0L;
        this.f5190p = new Runnable() { // from class: l.zb1
            @Override // java.lang.Runnable
            public final void run() {
                this.f28693a.m7892f();
            }
        };
    }
}
