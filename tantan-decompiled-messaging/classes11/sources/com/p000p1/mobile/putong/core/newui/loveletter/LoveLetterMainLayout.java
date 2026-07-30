package com.p000p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import l.t100;
import l.u4c0;
import l.xdl0;
import p009l.g7c;
import p009l.hcw;
import v.AutoVDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LoveLetterMainLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f3173a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f3174b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f3175c;

    /* JADX INFO: renamed from: d */
    public LoveLetterCenterTextLayout f3176d;

    public LoveLetterMainLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m3662a(hcw hcwVar, LoveLetterEntryInfo loveLetterEntryInfo) {
        Date date = new Date((long) loveLetterEntryInfo.startTime);
        Date date2 = new Date((long) loveLetterEntryInfo.endTime);
        SimpleDateFormat simpleDateFormatM14796a = new g7c("MM.dd", Locale.getDefault()).m14796a();
        String str = simpleDateFormatM14796a.format(date);
        String str2 = simpleDateFormatM14796a.format(date2);
        this.f3176d.m3622b("限时活动", "活动时间 " + str + " - " + str2 + "  ·  每人仅可发送 1 封");
    }

    /* JADX INFO: renamed from: b */
    public void m3663b(User user, LoveLetterMessageState loveLetterMessageState) {
        xdl0.X(this.f3176d, t100.d(312.0f));
        this.f3176d.m3621a(user.name, user.isFemale(), ((Media) user.fp()).url, loveLetterMessageState);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f3173a = findViewById(u4c0.p0);
        this.f3174b = findViewById(u4c0.ne);
        this.f3175c = findViewById(u4c0.oe);
        this.f3176d = (LoveLetterCenterTextLayout) findViewById(u4c0.W0);
        this.f3173a.x("https://auto.tancdn.com/v1/images/eyJpZCI6IlJSRlFMWUtEVEVEUDMzSU5RQVlMUjNEWjdKSkE2TTE0IiwidyI6MTEyNSwiaCI6NDgwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTE2ODY4ODY2OTA5NzgzMzM4NzR9.png", 1);
        xdl0.C0(this.f3173a, (int) ((xdl0.y0() * 160.0f) / 375.0f));
        this.f3174b.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IktWTFM3VEMyNFFBWE1GVENCVVBLM0I1N1FEVk1MRjE0IiwidyI6MzgyLCJoIjo3NiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjEwNzA4MDM2OTEyMzg2ODQ1NTg4fQ.png");
        this.f3175c.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IklQMlRIU0RQQkI1NU1ONzdRUlNSR0pHN1FXS0NDMzE0IiwidyI6NjQ4LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjowfQ.png");
    }

    public LoveLetterMainLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoveLetterMainLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
