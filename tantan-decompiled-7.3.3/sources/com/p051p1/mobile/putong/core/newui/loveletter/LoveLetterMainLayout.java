package com.p051p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p051p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p051p1.mobile.putong.data.User;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p151v.AutoVDraweeView;
import p153l.adc0;
import p153l.bnl0;
import p153l.few;
import p153l.m8c;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterMainLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public AutoVDraweeView f25137a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f25138b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f25139c;

    /* JADX INFO: renamed from: d */
    public LoveLetterCenterTextLayout f25140d;

    public LoveLetterMainLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m40594a(few fewVar, LoveLetterEntryInfo loveLetterEntryInfo) {
        Date date = new Date((long) loveLetterEntryInfo.startTime);
        Date date2 = new Date((long) loveLetterEntryInfo.endTime);
        SimpleDateFormat simpleDateFormatM157356a = new m8c("MM.dd", Locale.getDefault()).m157356a();
        String str = simpleDateFormatM157356a.format(date);
        String str2 = simpleDateFormatM157356a.format(date2);
        this.f25140d.m40554b("限时活动", "活动时间 " + str + " - " + str2 + "  ·  每人仅可发送 1 封");
    }

    /* JADX INFO: renamed from: b */
    public void m40595b(User user, LoveLetterMessageState loveLetterMessageState) {
        bnl0.m105540X(this.f25140d, qa00.m175859d(312.0f));
        this.f25140d.m40553a(user.name, user.isFemale(), user.m61308fp().url, loveLetterMessageState);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f25137a = (AutoVDraweeView) findViewById(adc0.f70497p0);
        this.f25138b = (AutoVDraweeView) findViewById(adc0.f70528qe);
        this.f25139c = (AutoVDraweeView) findViewById(adc0.f70545re);
        this.f25140d = (LoveLetterCenterTextLayout) findViewById(adc0.f70179W0);
        this.f25137a.m224133x("https://auto.tancdn.com/v1/images/eyJpZCI6IlJSRlFMWUtEVEVEUDMzSU5RQVlMUjNEWjdKSkE2TTE0IiwidyI6MTEyNSwiaCI6NDgwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTE2ODY4ODY2OTA5NzgzMzM4NzR9.png", 1);
        bnl0.m105505C0(this.f25137a, (int) ((bnl0.m105592y0() * 160.0f) / 375.0f));
        this.f25138b.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IktWTFM3VEMyNFFBWE1GVENCVVBLM0I1N1FEVk1MRjE0IiwidyI6MzgyLCJoIjo3NiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjEwNzA4MDM2OTEyMzg2ODQ1NTg4fQ.png");
        this.f25139c.setImageUrl("https://auto.tancdn.com/v1/images/eyJpZCI6IklQMlRIU0RQQkI1NU1ONzdRUlNSR0pHN1FXS0NDMzE0IiwidyI6NjQ4LCJoIjoyNjQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjowfQ.png");
    }

    public LoveLetterMainLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoveLetterMainLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
