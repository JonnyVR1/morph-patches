package com.p046p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p046p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p046p1.mobile.putong.data.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p147v.AutoVDraweeView;
import p149l.g7c;
import p149l.hcw;
import p149l.t100;
import p149l.u4c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterMainLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f24395a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f24396b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f24397c;

    /* JADX INFO: renamed from: d */
    public LoveLetterCenterTextLayout f24398d;

    public LoveLetterMainLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m39591a(hcw hcwVar, LoveLetterEntryInfo loveLetterEntryInfo) {
        Date date = new Date((long) loveLetterEntryInfo.startTime);
        Date date2 = new Date((long) loveLetterEntryInfo.endTime);
        SimpleDateFormat simpleDateFormatM124687a = new g7c("MM.dd", Locale.getDefault()).m124687a();
        String str = simpleDateFormatM124687a.format(date);
        String str2 = simpleDateFormatM124687a.format(date2);
        this.f24398d.m39551b("限时活动", "活动时间 " + str + " - " + str2 + "  ·  每人仅可发送 1 封");
    }

    /* JADX INFO: renamed from: b */
    public void m39592b(User user, LoveLetterMessageState loveLetterMessageState) {
        xdl0.m208360X(this.f24398d, t100.m186890d(312.0f));
        this.f24398d.m39550a(user.name, user.isFemale(), user.m60124fp().url, loveLetterMessageState);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f24395a = (AutoVDraweeView) findViewById(u4c0.f174406p0);
        this.f24396b = (AutoVDraweeView) findViewById(u4c0.f174386ne);
        this.f24397c = (AutoVDraweeView) findViewById(u4c0.f174403oe);
        this.f24398d = (LoveLetterCenterTextLayout) findViewById(u4c0.f174088W0);
        this.f24395a.m222887x("https://auto.tancdn.com/v1/images/eyJpZCI6IlJSRlFMWUtEVEVEUDMzSU5RQVlMUjNEWjdKSkE2TTE0IiwidyI6MTEyNSwiaCI6NDgwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTE2ODY4ODY2OTA5NzgzMzM4NzR9.png", 1);
        xdl0.m208325C0(this.f24395a, (int) ((xdl0.m208412y0() * 160.0f) / 375.0f));
        this.f24396b.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IktWTFM3VEMyNFFBWE1GVENCVVBLM0I1N1FEVk1MRjE0IiwidyI6MzgyLCJoIjo3NiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjEwNzA4MDM2OTEyMzg2ODQ1NTg4fQ.png");
        this.f24397c.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IklQMlRIU0RQQkI1NU1ONzdRUlNSR0pHN1FXS0NDMzE0IiwidyI6NjQ4LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjowfQ.png");
    }

    public LoveLetterMainLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoveLetterMainLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
