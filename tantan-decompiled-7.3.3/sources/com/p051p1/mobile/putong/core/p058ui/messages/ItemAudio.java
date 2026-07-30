package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.media.AudioPlayer;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VText;
import p153l.bnl0;
import p153l.dox;
import p153l.edc0;
import p153l.g9c0;
import p153l.ga1;
import p153l.gta;
import p153l.ibc0;
import p153l.iwl;
import p153l.ohc0;
import p153l.ovb0;
import p153l.pb1;
import p153l.qa00;
import p153l.r1j0;
import p153l.sfj0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemAudio extends LinearLayout implements InterfaceC8682a, View.OnClickListener {

    /* JADX INFO: renamed from: l */
    public static final String f31639l = "ItemAudio";

    /* JADX INFO: renamed from: a */
    public ItemAudio f31640a;

    /* JADX INFO: renamed from: b */
    public VText f31641b;

    /* JADX INFO: renamed from: c */
    public int f31642c;

    /* JADX INFO: renamed from: d */
    public Message f31643d;

    /* JADX INFO: renamed from: e */
    public ImageView f31644e;

    /* JADX INFO: renamed from: f */
    public VText f31645f;

    /* JADX INFO: renamed from: g */
    public AudioTranslationView f31646g;

    /* JADX INFO: renamed from: h */
    public AudioView f31647h;

    /* JADX INFO: renamed from: i */
    public int f31648i;

    /* JADX INFO: renamed from: j */
    public final ga1 f31649j;

    /* JADX INFO: renamed from: k */
    public View.OnClickListener f31650k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAudio$a */
    public class C8643a implements AudioView.InterfaceC8636b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f31651a;

        public C8643a(ImageView imageView) {
            this.f31651a = imageView;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.AudioView.InterfaceC8636b
        public void onAnimationEnd(int i) {
            this.f31651a.setImageDrawable(ItemAudio.this.m49208h(false));
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.AudioView.InterfaceC8636b
        public void onAnimationStart(int i) {
            this.f31651a.setImageDrawable(ItemAudio.this.m49208h(true));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAudio$b */
    public class C8644b implements ga1 {
        public C8644b() {
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            ItemAudio.this.m49206l();
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String str, AudioBusinessType audioBusinessType, ga1 ga1Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                r1j0.m179420g(audioBusinessType2.getBusinessMsg());
            } else {
                pb1.m171472b().mo171478g(str, audioBusinessType, ga1Var);
                ItemAudio.this.m49205k();
            }
        }

        @Override // p153l.ga1
        public void success() {
            ItemAudio.this.m49205k();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAudio$c */
    public class ViewOnClickListenerC8645c implements View.OnClickListener {
        public ViewOnClickListenerC8645c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            sfj0.m185596c("e_chat_message_convert_to_text_initial_button", ItemAudio.this.m49207g().f32488f.pageId(), new sfj0.C20032a[0]);
            ItemAudio.this.m49207g().mo50158l().m111028p7(ItemAudio.this.f31643d, true);
        }
    }

    public ItemAudio(Context context) {
        super(context);
        this.f31648i = 0;
        this.f31649j = new C8644b();
        this.f31650k = new ViewOnClickListenerC8645c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public void m49205k() {
        try {
            if (this.f31647h.m49054g()) {
                m49206l();
                return;
            }
            this.f31647h.setKeepScreenOn(true);
            CoreModule.m30934Q().mo68436Zo().mo136902f(true);
            m49207g().mo50160u0().m128955c1(this.f31643d);
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("ItemAudio onClick exception:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m49206l() {
        try {
            this.f31647h.setKeepScreenOn(false);
            m49207g().mo50160u0().m128961i1();
            m49211n(3);
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("ItemAudio onClick exception:" + e.getMessage(), e));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(final Message message) {
        Audio audio = (Audio) message.media.get(0);
        this.f31643d = message;
        this.f31642c = Math.max(1, (int) Math.ceil(audio.duration));
        String str = this.f31642c + "''";
        if (CoreModule.m30933P().m143412i().mo180325G1() || gta.m132210e().m132214d().mo34702I4()) {
            ImageView imageView = (ImageView) ((View) getParent()).findViewById(edc0.f93385j);
            this.f31644e = imageView;
            if (NullChecker.m82486a(imageView)) {
                this.f31644e.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114056j7 : ibc0.f113780E1);
            }
        }
        if (!message.isMe()) {
            ImageView imageView2 = (ImageView) ((View) getParent()).findViewById(edc0.f93385j);
            this.f31644e = imageView2;
            bnl0.m105524M(imageView2, !message.audio().audioRead);
        }
        if (m49207g().mo50160u0().m128942N0(message._id)) {
            try {
                if (m49207g().mo50160u0().m128940I0() == AudioPlayer.State.playing) {
                    int iCurrentPosition = m49207g().mo50160u0().m128939H0().currentPosition();
                    int i = ((int) (audio.duration * 1000.0f)) - iCurrentPosition;
                    if (i > 0) {
                        this.f31647h.setKeepScreenOn(true);
                        this.f31647h.m49057j(i, iCurrentPosition / (audio.duration * 1000.0f));
                    }
                } else {
                    this.f31647h.setKeepScreenOn(false);
                    m49211n(1);
                }
            } catch (Exception e) {
                CrashHelper.m82479c(new Exception("ItemAudio render exception:" + e.getMessage(), e));
            }
        } else if (m49207g().mo50160u0().m128940I0() == AudioPlayer.State.playing) {
            this.f31647h.setKeepScreenOn(true);
            m49211n(2);
        } else if (m49207g().mo50160u0().m128940I0() == AudioPlayer.State.stopped || m49207g().mo50160u0().m128940I0() == AudioPlayer.State.finished) {
            this.f31647h.setKeepScreenOn(false);
            m49211n(2);
        }
        this.f31641b.setText(str);
        if (CoreModule.m30933P().m143412i().mo180472g1()) {
            if (message.isOtherUser()) {
                this.f31645f = (VText) ((View) getParent()).findViewById(edc0.f93351e0);
                if (gta.m132210e().m132214d().mo34702I4()) {
                    this.f31645f.setTextColor(getResources().getColor(g9c0.f102819i));
                }
                this.f31645f.setOnClickListener(this.f31650k);
            }
            if (m49207g().mo50158l().m110983g7(message)) {
                this.f31646g.m49045d(message.localAudioText.translationResult);
                if (m49207g().mo50158l().m111020o4(message.f56859id)) {
                    this.f31646g.post(new Runnable() { // from class: l.c3q
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f79637a.m49210j(message);
                        }
                    });
                }
            } else {
                boolean zM111025p4 = m49207g().mo50158l().m111025p4(message.f56859id);
                AudioTranslationView audioTranslationView = this.f31646g;
                if (zM111025p4) {
                    audioTranslationView.setState(1);
                } else {
                    audioTranslationView.setState(0);
                }
            }
            if (NullChecker.m82486a(this.f31645f)) {
                m49207g().mo50160u0().m128959g1(message, this.f31645f);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public MessagesAct m49207g() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: h */
    public final Drawable m49208h(boolean z) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(ohc0.f147383a);
        Message message = this.f31643d;
        if (z) {
            return message.isMe() ? typedArrayObtainStyledAttributes.getDrawable(ohc0.f147389d) : typedArrayObtainStyledAttributes.getDrawable(ohc0.f147385b);
        }
        return message.isMe() ? typedArrayObtainStyledAttributes.getDrawable(ohc0.f147391e) : typedArrayObtainStyledAttributes.getDrawable(ohc0.f147387c);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean m49209i(View view) {
        return ItemMessageBase.m49494R(this).onLongClick(view);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m49210j(Message message) {
        iwl iwlVar = m49207g().mo50158l().m111048t7().f160408n1;
        int size = m49207g().mo50158l().m111048t7().m178953j0().m129496a0().size() - 1;
        while (true) {
            if (size < 0) {
                size = 0;
                break;
            } else if (TextUtils.equals(m49207g().mo50158l().m111048t7().m178953j0().m129496a0().get(size).f56859id, message.f56859id)) {
                break;
            } else {
                size--;
            }
        }
        View viewMo50794C = iwlVar.mo50794C((size + iwlVar.getHeaderViewsCountHook()) - iwlVar.getFirstVisiblePositionHook());
        if (viewMo50794C == null) {
            return;
        }
        bnl0.C16067g c16067gM105562j0 = bnl0.m105562j0(viewMo50794C, iwlVar.getRealView());
        int height = ((c16067gM105562j0.f77560b + c16067gM105562j0.f77562d) - iwlVar.getRealView().getHeight()) + iwlVar.getRealView().getPaddingBottom();
        if (height > 0) {
            iwlVar.mo50797j(height, Math.max(50, Math.min(200, (int) (((height * 1.0f) / qa00.f156338y) * 100.0f))));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX INFO: renamed from: n */
    public final void m49211n(int i) {
        pb1.m171472b().mo171476e(f31639l);
        this.f31647h.m49058k(i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        pb1.m171472b().mo171477f(f31639l, AudioBusinessType.NORMAL, this.f31649j);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31640a = this;
        this.f31641b = (VText) findViewById(edc0.f93168A4);
        this.f31647h = (AudioView) findViewById(edc0.f93420o);
        this.f31647h.setAudioListener(new C8643a((ImageView) findViewById(edc0.f93399l)));
        setOnClickListener(this);
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.b3q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f74804a.m49209i(view);
            }
        });
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM105592y0 = (int) (bnl0.m105592y0() * 0.66f);
        int iM175859d = qa00.m175859d(98.0f);
        int iMin = Math.min(iM105592y0, iM175859d + ((this.f31642c * (iM105592y0 - iM175859d)) / 60));
        if (CoreModule.m30933P().m143412i().mo180472g1() && NullChecker.m82486a(this.f31645f) && bnl0.m105529O0(this.f31645f)) {
            if (this.f31645f.getMeasuredWidth() <= 0) {
                this.f31645f.measure(i, i2);
            }
            int measuredWidth = this.f31645f.getMeasuredWidth() + qa00.f156321h;
            if (iMin + measuredWidth > iM105592y0) {
                iMin = iM105592y0 - measuredWidth;
            }
        }
        super.onMeasure(dox.m117364b(iMin), i2);
        if (CoreModule.m30933P().m143412i().mo180472g1() && NullChecker.m82486a(this.f31646g)) {
            this.f31646g.setMinimumWidth(getMeasuredWidth() - qa00.f156319f);
        }
    }

    public void setAudioTranslationView(AudioTranslationView audioTranslationView) {
        this.f31646g = audioTranslationView;
    }

    public void setAudioViewVisibleCallback(y20<Boolean> y20Var) {
        this.f31646g.setAudioViewVisibleCallback(y20Var);
    }

    public ItemAudio(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31648i = 0;
        this.f31649j = new C8644b();
        this.f31650k = new ViewOnClickListenerC8645c();
    }

    public ItemAudio(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31648i = 0;
        this.f31649j = new C8644b();
        this.f31650k = new ViewOnClickListenerC8645c();
    }
}
