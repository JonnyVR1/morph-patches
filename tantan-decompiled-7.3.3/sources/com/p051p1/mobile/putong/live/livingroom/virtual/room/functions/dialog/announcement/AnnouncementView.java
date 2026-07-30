package com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.announcement;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.VirtualVoiceMotionType;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.binding.LiveVirtualVoiceAnnouncementDialogViewBindings;
import com.p051p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.announcement.AnnouncementView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p151v.VText;
import p153l.ahn0;
import p153l.czq;
import p153l.i6t;
import p153l.iul;
import p153l.n3d0;
import p153l.n9c0;
import p153l.ngn0;
import p153l.r1j0;
import p153l.ts0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0005*\u0001\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/announcement/AnnouncementView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualVoiceAnnouncementDialogViewBindings;", "Ll/ts0;", "Ll/iul;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ll/ngn0;", OMSTemplateType.dialog, "", "a", "(Ll/ngn0;)V", "c", "()V", "com/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/announcement/AnnouncementView$a", "e", "Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/announcement/AnnouncementView$a;", "textWatcher", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class AnnouncementView extends LiveVirtualVoiceAnnouncementDialogViewBindings<ts0> implements iul {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final C13135a textWatcher;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.room.functions.dialog.announcement.AnnouncementView$a */
    @Metadata(m88120d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/virtual/room/functions/dialog/announcement/AnnouncementView$a", "Landroid/text/TextWatcher;", "", BLiveStormDanmakuGiftResourceType.f45294s, "", "start", "count", OMSSwipeMoment.after, "", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", OMSSwipeMoment.before, "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13135a implements TextWatcher {
        public C13135a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            s.getClass();
            if (s.length() > 0 && s.length() > 1000) {
                r1j0.m179419f(R$string.f47424Aj);
                AnnouncementView.this.f48939c.setText(s.subSequence(0, 1000).toString());
                EditText editText = AnnouncementView.this.f48939c;
                editText.setSelection(editText.getText().length());
            }
            AnnouncementView.this.f48940d.setSelected(s.length() > 0);
            boolean zIsSelected = AnnouncementView.this.f48940d.isSelected();
            AnnouncementView announcementView = AnnouncementView.this;
            if (zIsSelected) {
                announcementView.f48940d.setTextColor(n3d0.m161277a(n9c0.f140877w1));
            } else {
                announcementView.f48940d.setTextColor(n3d0.m161277a(n9c0.f140847m1));
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            s.getClass();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnouncementView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.textWatcher = new C13135a();
    }

    /* JADX INFO: renamed from: i */
    public static Unit m78509i(AnnouncementView announcementView, View view) {
        view.getClass();
        String string = announcementView.f48939c.getText().toString();
        if (!StringsKt.m94329e0(string)) {
            T t = announcementView.f48937a;
            t.getClass();
            ahn0.m97862d((i6t) t, VirtualVoiceMotionType.announcement);
            ((ts0) announcementView.f48937a).m192540P3(string);
        }
        return Unit.INSTANCE;
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: a */
    public void mo78510a(@NotNull ngn0 dialog) {
        dialog.getClass();
        VText vText = this.f48940d;
        vText.getClass();
        czq.m113347c(vText, new Function1() { // from class: l.vs0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnnouncementView.m78509i(this.f185548a, (View) obj);
            }
        });
        if (!TextUtils.isEmpty(((ts0) this.f48937a).m192543V3())) {
            this.f48939c.setText(((ts0) this.f48937a).m192543V3());
            this.f48939c.setSelection(((ts0) this.f48937a).m192543V3().length());
        }
        this.f48939c.addTextChangedListener(this.textWatcher);
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: b */
    public /* bridge */ void mo78511b(boolean z) {
        super.mo78511b(z);
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: c */
    public void mo78512c() {
        this.f48939c.removeTextChangedListener(this.textWatcher);
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: d */
    public /* bridge */ void mo78513d() {
        super.mo78513d();
    }

    @Override // p153l.iul
    /* JADX INFO: renamed from: e */
    public /* bridge */ void mo78514e() {
        super.mo78514e();
    }
}
