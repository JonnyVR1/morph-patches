package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.media.AudioPlayer;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.e30;
import p149l.ffx;
import p149l.i9c0;
import p149l.ib1;
import p149l.knb0;
import p149l.o6j0;
import p149l.osi0;
import p149l.t100;
import p149l.ura;
import p149l.utl;
import p149l.xdl0;
import p149l.y4c0;
import p149l.z91;

/* JADX INFO: loaded from: classes3.dex */
public class ItemAudio extends LinearLayout implements InterfaceC8519a, View.OnClickListener {

    /* JADX INFO: renamed from: l */
    public static final String f30791l = "ItemAudio";

    /* JADX INFO: renamed from: a */
    public ItemAudio f30792a;

    /* JADX INFO: renamed from: b */
    public VText f30793b;

    /* JADX INFO: renamed from: c */
    public int f30794c;

    /* JADX INFO: renamed from: d */
    public Message f30795d;

    /* JADX INFO: renamed from: e */
    public ImageView f30796e;

    /* JADX INFO: renamed from: f */
    public VText f30797f;

    /* JADX INFO: renamed from: g */
    public AudioTranslationView f30798g;

    /* JADX INFO: renamed from: h */
    public AudioView f30799h;

    /* JADX INFO: renamed from: i */
    public int f30800i;

    /* JADX INFO: renamed from: j */
    public final z91 f30801j;

    /* JADX INFO: renamed from: k */
    public View.OnClickListener f30802k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAudio$a */
    public class C8480a implements AudioView.InterfaceC8473b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f30803a;

        public C8480a(ImageView imageView) {
            this.f30803a = imageView;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.AudioView.InterfaceC8473b
        public void onAnimationEnd(int i) {
            this.f30803a.setImageDrawable(ItemAudio.this.m48025h(false));
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.AudioView.InterfaceC8473b
        public void onAnimationStart(int i) {
            this.f30803a.setImageDrawable(ItemAudio.this.m48025h(true));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAudio$b */
    public class C8481b implements z91 {
        public C8481b() {
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            ItemAudio.this.m48023l();
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                osi0.m165783g(audioBusinessType2.getBusinessMsg());
            } else {
                ib1.m135233b().mo135239g(str, audioBusinessType, z91Var);
                ItemAudio.this.m48022k();
            }
        }

        @Override // p149l.z91
        public void success() {
            ItemAudio.this.m48022k();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAudio$c */
    public class ViewOnClickListenerC8482c implements View.OnClickListener {
        public ViewOnClickListenerC8482c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o6j0.m162859c("e_chat_message_convert_to_text_initial_button", ItemAudio.this.m48024g().f31640f.pageId(), new o6j0.C18854a[0]);
            ItemAudio.this.m48024g().mo48974l().m120822p7(ItemAudio.this.f30795d, true);
        }
    }

    public ItemAudio(Context context) {
        super(context);
        this.f30800i = 0;
        this.f30801j = new C8481b();
        this.f30802k = new ViewOnClickListenerC8482c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public void m48022k() {
        try {
            if (this.f30799h.m47871g()) {
                m48023l();
                return;
            }
            this.f30799h.setKeepScreenOn(true);
            CoreModule.m29936Q().mo67253Zo().mo111895f(true);
            m48024g().mo48976t0().m143740c1(this.f30795d);
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("ItemAudio onClick exception:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m48023l() {
        try {
            this.f30799h.setKeepScreenOn(false);
            m48024g().mo48976t0().m143746i1();
            m48028n(3);
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("ItemAudio onClick exception:" + e.getMessage(), e));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(final Message message) {
        Audio audio = (Audio) message.media.get(0);
        this.f30795d = message;
        this.f30794c = Math.max(1, (int) Math.ceil(audio.duration));
        String str = this.f30794c + "''";
        if (CoreModule.m29935P().m94658i().mo158233G1() || ura.m195053e().m195057d().mo33699I4()) {
            ImageView imageView = (ImageView) ((View) getParent()).findViewById(y4c0.f196150j);
            this.f30796e = imageView;
            if (NullChecker.m81303a(imageView)) {
                this.f30796e.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78781j7 : c3c0.f78505E1);
            }
        }
        if (!message.isMe()) {
            ImageView imageView2 = (ImageView) ((View) getParent()).findViewById(y4c0.f196150j);
            this.f30796e = imageView2;
            xdl0.m208344M(imageView2, !message.audio().audioRead);
        }
        if (m48024g().mo48976t0().m143727N0(message._id)) {
            try {
                if (m48024g().mo48976t0().m143725I0() == AudioPlayer.State.playing) {
                    int iCurrentPosition = m48024g().mo48976t0().m143724H0().currentPosition();
                    int i = ((int) (audio.duration * 1000.0f)) - iCurrentPosition;
                    if (i > 0) {
                        this.f30799h.setKeepScreenOn(true);
                        this.f30799h.m47874j(i, iCurrentPosition / (audio.duration * 1000.0f));
                    }
                } else {
                    this.f30799h.setKeepScreenOn(false);
                    m48028n(1);
                }
            } catch (Exception e) {
                CrashHelper.m81296c(new Exception("ItemAudio render exception:" + e.getMessage(), e));
            }
        } else if (m48024g().mo48976t0().m143725I0() == AudioPlayer.State.playing) {
            this.f30799h.setKeepScreenOn(true);
            m48028n(2);
        } else if (m48024g().mo48976t0().m143725I0() == AudioPlayer.State.stopped || m48024g().mo48976t0().m143725I0() == AudioPlayer.State.finished) {
            this.f30799h.setKeepScreenOn(false);
            m48028n(2);
        }
        this.f30793b.setText(str);
        if (CoreModule.m29935P().m94658i().mo158380g1()) {
            if (message.isOtherUser()) {
                this.f30797f = (VText) ((View) getParent()).findViewById(y4c0.f196116e0);
                if (ura.m195053e().m195057d().mo33699I4()) {
                    this.f30797f.setTextColor(getResources().getColor(a1c0.f67155i));
                }
                this.f30797f.setOnClickListener(this.f30802k);
            }
            if (m48024g().mo48974l().m120777g7(message)) {
                this.f30798g.m47862d(message.localAudioText.translationResult);
                if (m48024g().mo48974l().m120814o4(message.f56011id)) {
                    this.f30798g.post(new Runnable() { // from class: l.c1q
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f78292a.m48027j(message);
                        }
                    });
                }
            } else {
                boolean zM120819p4 = m48024g().mo48974l().m120819p4(message.f56011id);
                AudioTranslationView audioTranslationView = this.f30798g;
                if (zM120819p4) {
                    audioTranslationView.setState(1);
                } else {
                    audioTranslationView.setState(0);
                }
            }
            if (NullChecker.m81303a(this.f30797f)) {
                m48024g().mo48976t0().m143744g1(message, this.f30797f);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public MessagesAct m48024g() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: h */
    public final Drawable m48025h(boolean z) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(i9c0.f112158a);
        Message message = this.f30795d;
        if (z) {
            return message.isMe() ? typedArrayObtainStyledAttributes.getDrawable(i9c0.f112164d) : typedArrayObtainStyledAttributes.getDrawable(i9c0.f112160b);
        }
        return message.isMe() ? typedArrayObtainStyledAttributes.getDrawable(i9c0.f112166e) : typedArrayObtainStyledAttributes.getDrawable(i9c0.f112162c);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean m48026i(View view) {
        return ItemMessageBase.m48311R(this).onLongClick(view);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m48027j(Message message) {
        utl utlVar = m48024g().mo48974l().m120842t7().f171745n1;
        int size = m48024g().mo48974l().m120842t7().m190310j0().m139109a0().size() - 1;
        while (true) {
            if (size < 0) {
                size = 0;
                break;
            } else if (TextUtils.equals(m48024g().mo48974l().m120842t7().m190310j0().m139109a0().get(size).f56011id, message.f56011id)) {
                break;
            } else {
                size--;
            }
        }
        View viewMo49611C = utlVar.mo49611C((size + utlVar.getHeaderViewsCountHook()) - utlVar.getFirstVisiblePositionHook());
        if (viewMo49611C == null) {
            return;
        }
        xdl0.C21104g c21104gM208382j0 = xdl0.m208382j0(viewMo49611C, utlVar.getRealView());
        int height = ((c21104gM208382j0.f192419b + c21104gM208382j0.f192421d) - utlVar.getRealView().getHeight()) + utlVar.getRealView().getPaddingBottom();
        if (height > 0) {
            utlVar.mo49614j(height, Math.max(50, Math.min(200, (int) (((height * 1.0f) / t100.f167276y) * 100.0f))));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX INFO: renamed from: n */
    public final void m48028n(int i) {
        ib1.m135233b().mo135237e(f30791l);
        this.f30799h.m47875k(i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ib1.m135233b().mo135238f(f30791l, AudioBusinessType.NORMAL, this.f30801j);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f30792a = this;
        this.f30793b = (VText) findViewById(y4c0.f195933A4);
        this.f30799h = (AudioView) findViewById(y4c0.f196185o);
        this.f30799h.setAudioListener(new C8480a((ImageView) findViewById(y4c0.f196164l)));
        setOnClickListener(this);
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.b1q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f72619a.m48026i(view);
            }
        });
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM208412y0 = (int) (xdl0.m208412y0() * 0.66f);
        int iM186890d = t100.m186890d(98.0f);
        int iMin = Math.min(iM208412y0, iM186890d + ((this.f30794c * (iM208412y0 - iM186890d)) / 60));
        if (CoreModule.m29935P().m94658i().mo158380g1() && NullChecker.m81303a(this.f30797f) && xdl0.m208349O0(this.f30797f)) {
            if (this.f30797f.getMeasuredWidth() <= 0) {
                this.f30797f.measure(i, i2);
            }
            int measuredWidth = this.f30797f.getMeasuredWidth() + t100.f167259h;
            if (iMin + measuredWidth > iM208412y0) {
                iMin = iM208412y0 - measuredWidth;
            }
        }
        super.onMeasure(ffx.m121199b(iMin), i2);
        if (CoreModule.m29935P().m94658i().mo158380g1() && NullChecker.m81303a(this.f30798g)) {
            this.f30798g.setMinimumWidth(getMeasuredWidth() - t100.f167257f);
        }
    }

    public void setAudioTranslationView(AudioTranslationView audioTranslationView) {
        this.f30798g = audioTranslationView;
    }

    public void setAudioViewVisibleCallback(e30<Boolean> e30Var) {
        this.f30798g.setAudioViewVisibleCallback(e30Var);
    }

    public ItemAudio(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30800i = 0;
        this.f30801j = new C8481b();
        this.f30802k = new ViewOnClickListenerC8482c();
    }

    public ItemAudio(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30800i = 0;
        this.f30801j = new C8481b();
        this.f30802k = new ViewOnClickListenerC8482c();
    }
}
