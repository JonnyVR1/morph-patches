package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p1.mobile.android.media.AudioPlayer;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.Audio;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.ffx;
import l.i9c0;
import l.ib1;
import l.knb0;
import l.o6j0;
import l.osi0;
import l.t100;
import l.ura;
import l.utl;
import l.xdl0;
import l.y4c0;
import l.z91;
import p003l.e30;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemAudio extends LinearLayout implements InterfaceC0102a, View.OnClickListener {

    /* JADX INFO: renamed from: l */
    public static final String f682l = "ItemAudio";

    /* JADX INFO: renamed from: a */
    public ItemAudio f683a;

    /* JADX INFO: renamed from: b */
    public VText f684b;

    /* JADX INFO: renamed from: c */
    public int f685c;

    /* JADX INFO: renamed from: d */
    public Message f686d;

    /* JADX INFO: renamed from: e */
    public ImageView f687e;

    /* JADX INFO: renamed from: f */
    public VText f688f;

    /* JADX INFO: renamed from: g */
    public AudioTranslationView f689g;

    /* JADX INFO: renamed from: h */
    public AudioView f690h;

    /* JADX INFO: renamed from: i */
    public int f691i;

    /* JADX INFO: renamed from: j */
    public final z91 f692j;

    /* JADX INFO: renamed from: k */
    public View.OnClickListener f693k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAudio$a */
    public class C0063a implements AudioView.InterfaceC0056b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageView f694a;

        public C0063a(ImageView imageView) {
            this.f694a = imageView;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.AudioView.InterfaceC0056b
        public void onAnimationEnd(int i) {
            this.f694a.setImageDrawable(ItemAudio.this.m1103h(false));
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.AudioView.InterfaceC0056b
        public void onAnimationStart(int i) {
            this.f694a.setImageDrawable(ItemAudio.this.m1103h(true));
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAudio$b */
    public class C0064b implements z91 {
        public C0064b() {
        }

        /* JADX INFO: renamed from: b */
        public void m1107b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            ItemAudio.this.m1101l();
        }

        /* JADX INFO: renamed from: d */
        public void m1108d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (audioBusinessType2.isHighLevelBusiness()) {
                osi0.g(audioBusinessType2.getBusinessMsg());
            } else {
                ib1.b().g(str, audioBusinessType, z91Var);
                ItemAudio.this.m1100k();
            }
        }

        public void success() {
            ItemAudio.this.m1100k();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemAudio$c */
    public class ViewOnClickListenerC0065c implements View.OnClickListener {
        public ViewOnClickListenerC0065c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o6j0.c("e_chat_message_convert_to_text_initial_button", ItemAudio.this.m1102g().f1531f.pageId(), new o6j0.a[0]);
            ItemAudio.this.m1102g().mo2066l().m4289p7(ItemAudio.this.f686d, true);
        }
    }

    public ItemAudio(Context context) {
        super(context);
        this.f691i = 0;
        this.f692j = new C0064b();
        this.f693k = new ViewOnClickListenerC0065c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public void m1100k() {
        try {
            if (this.f690h.m944g()) {
                m1101l();
                return;
            }
            this.f690h.setKeepScreenOn(true);
            CoreModule.Q().Zo().f(true);
            m1102g().mo2068t0().c1(this.f686d);
        } catch (Exception e) {
            CrashHelper.c(new Exception("ItemAudio onClick exception:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m1101l() {
        try {
            this.f690h.setKeepScreenOn(false);
            m1102g().mo2068t0().i1();
            m1106n(3);
        } catch (Exception e) {
            CrashHelper.c(new Exception("ItemAudio onClick exception:" + e.getMessage(), e));
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(final Message message) {
        Audio audio = (Audio) message.media.get(0);
        this.f686d = message;
        this.f685c = Math.max(1, (int) Math.ceil(audio.duration));
        CharSequence charSequence = this.f685c + "''";
        if (CoreModule.P().i().G1() || ura.e().d().I4()) {
            ImageView imageView = (ImageView) ((View) getParent()).findViewById(y4c0.j);
            this.f687e = imageView;
            if (NullChecker.a(imageView)) {
                this.f687e.setImageResource(ura.e().d().I4() ? c3c0.j7 : c3c0.E1);
            }
        }
        if (!message.isMe()) {
            ImageView imageView2 = (ImageView) ((View) getParent()).findViewById(y4c0.j);
            this.f687e = imageView2;
            xdl0.M(imageView2, !message.audio().audioRead);
        }
        if (m1102g().mo2068t0().N0(((DbObject) message)._id)) {
            try {
                if (m1102g().mo2068t0().I0() == AudioPlayer.State.playing) {
                    int iCurrentPosition = m1102g().mo2068t0().H0().currentPosition();
                    int i = ((int) (audio.duration * 1000.0f)) - iCurrentPosition;
                    if (i > 0) {
                        this.f690h.setKeepScreenOn(true);
                        this.f690h.m947j(i, iCurrentPosition / (audio.duration * 1000.0f));
                    }
                } else {
                    this.f690h.setKeepScreenOn(false);
                    m1106n(1);
                }
            } catch (Exception e) {
                CrashHelper.c(new Exception("ItemAudio render exception:" + e.getMessage(), e));
            }
        } else if (m1102g().mo2068t0().I0() == AudioPlayer.State.playing) {
            this.f690h.setKeepScreenOn(true);
            m1106n(2);
        } else if (m1102g().mo2068t0().I0() == AudioPlayer.State.stopped || m1102g().mo2068t0().I0() == AudioPlayer.State.finished) {
            this.f690h.setKeepScreenOn(false);
            m1106n(2);
        }
        this.f684b.setText(charSequence);
        if (CoreModule.P().i().g1()) {
            if (message.isOtherUser()) {
                this.f688f = (VText) ((View) getParent()).findViewById(y4c0.e0);
                if (ura.e().d().I4()) {
                    this.f688f.setTextColor(getResources().getColor(a1c0.i));
                }
                this.f688f.setOnClickListener(this.f693k);
            }
            if (m1102g().mo2066l().m4244g7(message)) {
                this.f689g.m935d(message.localAudioText.translationResult);
                if (m1102g().mo2066l().m4281o4(((DbObject) message).id)) {
                    this.f689g.post(new Runnable() { // from class: l.c1q
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f2560a.m1105j(message);
                        }
                    });
                }
            } else {
                boolean zM4286p4 = m1102g().mo2066l().m4286p4(((DbObject) message).id);
                AudioTranslationView audioTranslationView = this.f689g;
                if (zM4286p4) {
                    audioTranslationView.setState(1);
                } else {
                    audioTranslationView.setState(0);
                }
            }
            if (NullChecker.a(this.f688f)) {
                m1102g().mo2068t0().g1(message, this.f688f);
            }
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public MessagesAct m1102g() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: h */
    public final Drawable m1103h(boolean z) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(i9c0.a);
        Message message = this.f686d;
        if (z) {
            return message.isMe() ? typedArrayObtainStyledAttributes.getDrawable(i9c0.d) : typedArrayObtainStyledAttributes.getDrawable(i9c0.b);
        }
        return message.isMe() ? typedArrayObtainStyledAttributes.getDrawable(i9c0.e) : typedArrayObtainStyledAttributes.getDrawable(i9c0.c);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean m1104i(View view) {
        return ItemMessageBase.m1395R(this).onLongClick(view);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m1105j(Message message) {
        utl utlVar = m1102g().mo2066l().m4309t7().f7677n1;
        int size = m1102g().mo2066l().m4309t7().m7936j0().m5284a0().size() - 1;
        while (true) {
            if (size < 0) {
                size = 0;
                break;
            } else if (TextUtils.equals(((DbObject) m1102g().mo2066l().m4309t7().m7936j0().m5284a0().get(size)).id, ((DbObject) message).id)) {
                break;
            } else {
                size--;
            }
        }
        View viewC = utlVar.C((size + utlVar.getHeaderViewsCountHook()) - utlVar.getFirstVisiblePositionHook());
        if (viewC == null) {
            return;
        }
        xdl0.g gVarJ0 = xdl0.j0(viewC, utlVar.getRealView());
        int height = ((gVarJ0.b + gVarJ0.d) - utlVar.getRealView().getHeight()) + utlVar.getRealView().getPaddingBottom();
        if (height > 0) {
            utlVar.j(height, Math.max(50, Math.min(200, (int) (((height * 1.0f) / t100.y) * 100.0f))));
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX INFO: renamed from: n */
    public final void m1106n(int i) {
        ib1.b().e(f682l);
        this.f690h.m948k(i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ib1.b().f(f682l, AudioBusinessType.NORMAL, this.f692j);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f683a = this;
        this.f684b = (VText) findViewById(y4c0.A4);
        this.f690h = (AudioView) findViewById(y4c0.o);
        this.f690h.setAudioListener(new C0063a((ImageView) findViewById(y4c0.l)));
        setOnClickListener(this);
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.b1q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f2336a.m1104i(view);
            }
        });
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iY0 = (int) (xdl0.y0() * 0.66f);
        int iD = t100.d(98.0f);
        int iMin = Math.min(iY0, iD + ((this.f685c * (iY0 - iD)) / 60));
        if (CoreModule.P().i().g1() && NullChecker.a(this.f688f) && xdl0.O0(this.f688f)) {
            if (this.f688f.getMeasuredWidth() <= 0) {
                this.f688f.measure(i, i2);
            }
            int measuredWidth = this.f688f.getMeasuredWidth() + t100.h;
            if (iMin + measuredWidth > iY0) {
                iMin = iY0 - measuredWidth;
            }
        }
        super.onMeasure(ffx.b(iMin), i2);
        if (CoreModule.P().i().g1() && NullChecker.a(this.f689g)) {
            this.f689g.setMinimumWidth(getMeasuredWidth() - t100.f);
        }
    }

    public void setAudioTranslationView(AudioTranslationView audioTranslationView) {
        this.f689g = audioTranslationView;
    }

    public void setAudioViewVisibleCallback(e30<Boolean> e30Var) {
        this.f689g.setAudioViewVisibleCallback(e30Var);
    }

    public ItemAudio(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f691i = 0;
        this.f692j = new C0064b();
        this.f693k = new ViewOnClickListenerC0065c();
    }

    public ItemAudio(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f691i = 0;
        this.f692j = new C0064b();
        this.f693k = new ViewOnClickListenerC0065c();
    }
}
