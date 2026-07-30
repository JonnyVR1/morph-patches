package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.match.C8619b;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VListCell;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.i4g0;
import p153l.nrb0;
import p153l.pa6;
import p153l.qa00;
import p153l.uqb0;
import p153l.w30;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemInstantChatGuideView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f25563a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f25564b;

    /* JADX INFO: renamed from: c */
    public VText f25565c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f25566d;

    /* JADX INFO: renamed from: e */
    public VImage f25567e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f25568f;

    /* JADX INFO: renamed from: g */
    public VText f25569g;

    /* JADX INFO: renamed from: h */
    public VImage f25570h;

    /* JADX INFO: renamed from: i */
    public Act f25571i;

    /* JADX INFO: renamed from: j */
    public Conversation f25572j;

    /* JADX INFO: renamed from: k */
    public User f25573k;

    /* JADX INFO: renamed from: l */
    public Long f25574l;

    /* JADX INFO: renamed from: m */
    public w30 f25575m;

    public class ShaderBLToTRSpan extends ForegroundColorSpan {

        @NonNull
        @ColorInt
        int[] colors;
        float[] positions;
        String value;

        public ShaderBLToTRSpan(int i, @NonNull @ColorInt String str, int[] iArr, float[] fArr) {
            super(i);
            this.value = str;
            this.colors = iArr;
            this.positions = fArr;
        }

        @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            float fMeasureText = textPaint.measureText(this.value);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            float f = qa00.f156323j;
            if (NullChecker.m82486a(fontMetrics)) {
                f = fontMetrics.descent - fontMetrics.ascent;
            }
            textPaint.setShader(new LinearGradient(0.0f, f, fMeasureText, 0.0f, this.colors, this.positions, Shader.TileMode.CLAMP));
        }
    }

    public ConversationItemInstantChatGuideView(Context context) {
        super(context);
        this.f25574l = 0L;
    }

    /* JADX INFO: renamed from: f */
    public final void m41842f(View view) {
        pa6.m171414a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m41843g(boolean z) {
        if (this.f25573k.isFemale()) {
            return z ? "她最近看过你" : "你喜欢了她";
        }
        return z ? "他最近看过你" : "你喜欢了他";
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m41844h() {
        CoreModule.f18264c.f20299C2.m185449o3(this.f25573k.f56859id, false);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m41845i(View view) {
        if (NullChecker.m82486a(this.f25573k)) {
            i4g0.m138520r("e_odiamond_locked_match", OMSDialogPositon.p_messages_view);
        }
        C8619b.m48819o(this.f25571i, this.f25573k, "p_messages,odiamond_sayhi", new x20() { // from class: l.ma6
            @Override // p153l.x20
            public final void call() {
                this.f135476a.m41844h();
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m41846j(View view) {
        this.f25575m.m204614b();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m41847k(VListCell vListCell, VListCell.C22660a c22660a, int i) {
        this.f25575m.m204614b();
        if (NullChecker.m82486a(this.f25573k)) {
            CoreModule.f18264c.f20299C2.m185449o3(this.f25573k.f56859id, true);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean m41848l(View view) {
        w30.C21001b c21001b = new w30.C21001b(this.f25571i);
        ArrayList arrayList = new ArrayList();
        arrayList.add("删除");
        w30 w30VarM204654F = c21001b.m204657I(this.f25571i.getResources().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.na6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f140980a.m41846j(view2);
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.oa6
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f145663a.m41847k(vListCell, c22660a, i);
            }
        }).m204654F();
        this.f25575m = w30VarM204654F;
        w30VarM204654F.m204618f();
        return false;
    }

    /* JADX INFO: renamed from: m */
    public void m41849m(Act act, Conversation conversation) {
        this.f25571i = act;
        this.f25572j = conversation;
        User userById = CoreModule.m30930K().getUserById(conversation.otherUser);
        this.f25573k = userById;
        if (userById == null) {
            return;
        }
        m41852p();
        m41855s();
        m41854r();
    }

    /* JADX INFO: renamed from: n */
    public final void m41850n(boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String strM41843g = m41843g(z);
        spannableStringBuilder.append((CharSequence) strM41843g);
        int length = strM41843g.length();
        spannableStringBuilder.setSpan(new ShaderBLToTRSpan(Color.parseColor("#9F6820"), strM41843g, new int[]{Color.parseColor("#9F6820"), Color.parseColor("#C58D32"), Color.parseColor("#9F6820")}, new float[]{0.2f, 0.5f, 0.8f}), 0, length, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, length, 33);
        spannableStringBuilder.append((CharSequence) " · ");
        int i = length + 3;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#C28B31")), length, i, 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), length, i, 33);
        spannableStringBuilder.append((CharSequence) "点击按钮马上配对");
        this.f25569g.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: o */
    public final void m41851o() {
        boolean zIsPicVerificationVerified = this.f25573k.isPicVerificationVerified();
        VImage vImage = this.f25567e;
        if (zIsPicVerificationVerified) {
            vImage.setBackgroundResource(dbc0.f86764Yj);
            bnl0.m105524M(this.f25567e, true);
        } else {
            bnl0.m105524M(vImage, false);
        }
        if (nrb0.m164466b()) {
            uqb0.f180396b0.f170325b.showUserVerificationLogo(getContext(), this.f25573k, this.f25567e);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41842f(this);
        this.f25565c.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: p */
    public final void m41852p() {
        uqb0.f180374G.m127115L0(this.f25563a, this.f25573k.m61308fp().profileSmall().formatted());
        this.f25565c.setText(this.f25573k.name);
        m41851o();
        m41853q(CoreModule.f18264c.f20299C2.m185455x3(this.f25572j));
        bnl0.m105524M(this.f25566d, this.f25567e.getVisibility() == 0 || this.f25568f.getVisibility() == 0);
        m41850n(CoreModule.f18264c.f20299C2.m185455x3(this.f25572j));
    }

    /* JADX INFO: renamed from: q */
    public final void m41853q(boolean z) {
        Settings settings;
        List<SettingGroups> list;
        int i = 0;
        bnl0.m105524M(this.f25568f, false);
        if (!z || (settings = this.f25573k.settings) == null || (list = settings.settingGroups) == null || list.isEmpty() || settings.settingGroups.get(0) == null || settings.settingGroups.get(0).live == null) {
            return;
        }
        switch (settings.settingGroups.get(0).live.wealthGrade) {
            case 30:
                i = dbc0.f86398N5;
                break;
            case 31:
                i = dbc0.f86430O5;
                break;
            case 32:
                i = dbc0.f86462P5;
                break;
            case 33:
                i = dbc0.f86494Q5;
                break;
            case 34:
                i = dbc0.f86526R5;
                break;
            case 35:
                i = dbc0.f86558S5;
                break;
        }
        if (i != 0) {
            bnl0.m105524M(this.f25568f, true);
            uqb0.f180374G.m127138Y0(this.f25568f, i);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m41854r() {
        if (System.currentTimeMillis() - this.f25574l.longValue() <= 300) {
            return;
        }
        this.f25574l = Long.valueOf(System.currentTimeMillis());
        if (NullChecker.m82486a(this.f25573k)) {
            i4g0.m138526x("e_odiamond_locked_match", OMSDialogPositon.p_messages_view);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m41855s() {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ka6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124626a.m41845i(view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.la6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f130658a.m41848l(view);
            }
        });
    }

    public ConversationItemInstantChatGuideView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25574l = 0L;
    }

    public ConversationItemInstantChatGuideView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25574l = 0L;
    }

    public ConversationItemInstantChatGuideView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f25574l = 0L;
    }
}
