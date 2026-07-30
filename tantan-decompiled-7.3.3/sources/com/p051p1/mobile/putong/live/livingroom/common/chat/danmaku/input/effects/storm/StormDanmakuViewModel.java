package com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmaku;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuResource;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuTip;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuTipContent;
import com.p051p1.mobile.putong.live.base.view.RatioLayout;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuViewModel;
import java.io.IOException;
import p151v.VEditText;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.a9g0;
import p153l.bnl0;
import p153l.fc2;
import p153l.guf0;
import p153l.h7g0;
import p153l.iam;
import p153l.j35;
import p153l.jyb;
import p153l.o1j0;
import p153l.p6g0;
import p153l.pf60;
import p153l.qa00;
import p153l.qnp0;
import p153l.v6g0;
import p153l.y20;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class StormDanmakuViewModel extends LinearLayout implements iam<p6g0> {

    /* JADX INFO: renamed from: a */
    public VImage f49643a;

    /* JADX INFO: renamed from: b */
    public VImage f49644b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f49645c;

    /* JADX INFO: renamed from: d */
    public RatioLayout f49646d;

    /* JADX INFO: renamed from: e */
    public TextureView f49647e;

    /* JADX INFO: renamed from: f */
    public VEditText f49648f;

    /* JADX INFO: renamed from: g */
    public VText f49649g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f49650h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f49651i;

    /* JADX INFO: renamed from: j */
    public VText f49652j;

    /* JADX INFO: renamed from: k */
    public p6g0 f49653k;

    /* JADX INFO: renamed from: l */
    public BLiveStormDanmaku f49654l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public v6g0 f49655m;

    /* JADX INFO: renamed from: n */
    public final Drawable f49656n;

    /* JADX INFO: renamed from: o */
    public final Drawable f49657o;

    /* JADX INFO: renamed from: p */
    public MediaPlayer f49658p;

    /* JADX INFO: renamed from: q */
    public Surface f49659q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public Runnable f49660r;

    /* JADX INFO: renamed from: s */
    public boolean f49661s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuViewModel$a */
    public class C12904a implements TextWatcher {
        public C12904a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            StormDanmakuViewModel.this.m73713L();
            StormDanmakuViewModel.this.m73714N(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuViewModel$b */
    public class TextureViewSurfaceTextureListenerC12905b implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC12905b() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            StormDanmakuViewModel.this.f49659q = new Surface(surfaceTexture);
            if (StormDanmakuViewModel.this.f49660r != null) {
                StormDanmakuViewModel.this.f49660r.run();
                StormDanmakuViewModel.this.f49660r = null;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            StormDanmakuViewModel.this.m73745S();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public StormDanmakuViewModel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = qa00.f156324k;
        this.f49656n = fc2.m124971a(436207615, i, false);
        this.f49657o = fc2.m124971a(-30697, i, false);
        this.f49661s = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m73712B(View view) {
        m73732A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public void m73713L() {
        boolean z = m73750z() || (this.f49648f.getText() != null && j35.m143317b(this.f49648f.getText().toString()).length() > 0);
        this.f49652j.setBackground(z ? this.f49657o : this.f49656n);
        this.f49652j.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public void m73714N(Editable editable) {
        int length = editable == null ? 0 : editable.toString().length();
        this.f49649g.setText(length + "/15");
    }

    /* JADX INFO: renamed from: Q */
    private void m73715Q() {
        BLiveStormDanmaku bLiveStormDanmaku = this.f49654l;
        if (bLiveStormDanmaku == null || jyb.m147479J(bLiveStormDanmaku.resources)) {
            return;
        }
        BLiveStormDanmakuResource bLiveStormDanmakuResource = this.f49654l.resources.get(0);
        pf60<String, String> inputText = getInputText();
        this.f49653k.m170884Z3(inputText.f152156a, inputText.f152157b, bLiveStormDanmakuResource);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m73720e(StringBuilder sb, BLiveStormDanmakuTipContent bLiveStormDanmakuTipContent) {
        String str = "{" + bLiveStormDanmakuTipContent.key + "}";
        int iIndexOf = sb.indexOf(str);
        if (iIndexOf >= 0) {
            sb.replace(iIndexOf, str.length() + iIndexOf, bLiveStormDanmakuTipContent.value);
        }
    }

    private pf60<String, String> getInputText() {
        v6g0 v6g0Var;
        int iM170877S3 = this.f49653k.m170877S3();
        if (iM170877S3 < 0 || (v6g0Var = this.f49655m) == null || iM170877S3 >= v6g0Var.mo29823C()) {
            return jyb.m147494Y(this.f49648f.getText() == null ? "" : this.f49648f.getText().toString(), "");
        }
        BLiveStormDanmakuTip item = this.f49655m.getItem(iM170877S3);
        final StringBuilder sb = new StringBuilder(item.text);
        if (!jyb.m147479J(item.fields)) {
            jyb.m147537z(item.fields, new y20() { // from class: l.w6g0
                @Override // p153l.y20
                public final void call(Object obj) {
                    StormDanmakuViewModel.m73720e(sb, (BLiveStormDanmakuTipContent) obj);
                }
            });
        }
        return jyb.m147494Y(sb.toString(), item.f45296id);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ CharSequence m73722i(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = 15 - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47543G6, 15));
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        return (Character.isHighSurrogate(charSequence.charAt(i5 + (-1))) && (i5 = i5 + (-1)) == i) ? "" : charSequence.subSequence(i, i5);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ CharSequence m73723j(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        char[] charArray = charSequence.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (!a9g0.m96574i(c)) {
                sb.append(c);
            }
        }
        if (TextUtils.isEmpty(sb)) {
            return "";
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public void m73732A() {
        Act act = act();
        if (act != null) {
            act.hideInput(this.f49648f);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ boolean m73733C(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        m73715Q();
        return true;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m73734E(View view) {
        this.f49653k.m170881W3();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m73735F(View view) {
        if (view.isEnabled()) {
            m73715Q();
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m73736G(View view) {
        this.f49653k.m170875P3();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m73737H(View view) {
        this.f49653k.m170885a4();
    }

    /* JADX INFO: renamed from: J */
    public boolean m73739J() {
        if (this.f49661s) {
            return false;
        }
        m73732A();
        return true;
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void m73738I(final String str) {
        if (this.f49659q == null) {
            this.f49660r = new Runnable() { // from class: l.g7g0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f102541a.m73738I(str);
                }
            };
            return;
        }
        MediaPlayer mediaPlayer = this.f49658p;
        if (mediaPlayer == null) {
            this.f49658p = new MediaPlayer();
        } else {
            mediaPlayer.reset();
        }
        this.f49658p.setSurface(this.f49659q);
        try {
            this.f49658p.setDataSource(str);
            this.f49658p.setLooping(true);
            this.f49658p.prepareAsync();
            this.f49658p.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: l.x6g0
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    mediaPlayer2.start();
                }
            });
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m73741M() {
        boolean zM73750z = m73750z();
        this.f49648f.setTextColor(zM73750z ? -2130706433 : -1);
        this.f49648f.setCursorVisible(!zM73750z);
    }

    /* JADX INFO: renamed from: O */
    public void m73742O() {
        v6g0 v6g0Var = this.f49655m;
        if (v6g0Var != null) {
            v6g0Var.notifyDataSetChanged();
        }
        m73713L();
        m73741M();
    }

    /* JADX INFO: renamed from: P */
    public void m73743P(BLiveStormDanmaku bLiveStormDanmaku) {
        this.f49654l = bLiveStormDanmaku;
        v6g0 v6g0Var = new v6g0(this.f49653k, bLiveStormDanmaku.defaultComments);
        this.f49655m = v6g0Var;
        this.f49651i.setAdapter(v6g0Var);
        if (!jyb.m147479J(bLiveStormDanmaku.resources)) {
            BLiveStormDanmakuResource bLiveStormDanmakuResource = bLiveStormDanmaku.resources.get(0);
            this.f49652j.setText(String.format(getResources().getString(R$string.f48064ee), bLiveStormDanmakuResource.price));
            String str = bLiveStormDanmakuResource.bgUrl;
            if (!TextUtils.isEmpty(str)) {
                m73738I(str);
            }
            this.f49648f.setHint(bLiveStormDanmakuResource.placeholderText);
        }
        m73713L();
    }

    /* JADX INFO: renamed from: R */
    public void m73744R(boolean z) {
        bnl0.m105524M(this.f49643a, z);
    }

    /* JADX INFO: renamed from: S */
    public final void m73745S() {
        MediaPlayer mediaPlayer = this.f49658p;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f49658p.stop();
            }
            this.f49658p.release();
            this.f49658p = null;
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73746v(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.y6g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197685a.m73712B(view);
            }
        });
        RatioLayout ratioLayout = this.f49646d;
        int i = qa00.f156324k;
        ratioLayout.setBackground(fc2.m124972b(150994943, -3355444, i, i, 0.0f, 0.0f, false, false));
        this.f49648f.setFilters(new InputFilter[]{new InputFilter() { // from class: l.z6g0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                return StormDanmakuViewModel.m73723j(charSequence, i2, i3, spanned, i4, i5);
            }
        }, new InputFilter() { // from class: l.a7g0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                return StormDanmakuViewModel.m73722i(charSequence, i2, i3, spanned, i4, i5);
            }
        }});
        this.f49648f.addTextChangedListener(new C12904a());
        this.f49648f.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.b7g0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return this.f75301a.m73733C(textView, i2, keyEvent);
            }
        });
        this.f49648f.setOnClickListener(new View.OnClickListener() { // from class: l.c7g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80113a.m73734E(view);
            }
        });
        this.f49652j.setOnClickListener(new View.OnClickListener() { // from class: l.d7g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85511a.m73735F(view);
            }
        });
        m73714N(this.f49648f.getText());
        this.f49651i.setHasFixedSize(true);
        this.f49651i.setOverScrollMode(2);
        this.f49651i.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f49651i.addItemDecoration(new guf0(qa00.f156321h, qa00.f156328o));
        this.f49647e.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC12905b());
        qnp0.m177260c1(this.f49647e, 0, 0, 0, -i, i);
        this.f49643a.setOnClickListener(new View.OnClickListener() { // from class: l.e7g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92428a.m73736G(view);
            }
        });
        this.f49644b.setOnClickListener(new View.OnClickListener() { // from class: l.f7g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97557a.m73737H(view);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m73746v(View view) {
        h7g0.m133798a(this, view);
    }

    /* JADX INFO: renamed from: w */
    public void m73747w(int i) {
        boolean z = i == 0;
        this.f49661s = z;
        bnl0.m105524M(this.f49646d, z);
        this.f49645c.scrollTo(0, this.f49661s ? 0 : -qa00.f156321h);
        p6g0 p6g0Var = this.f49653k;
        if (p6g0Var != null) {
            if (this.f49661s) {
                p6g0Var.m170886b4(0);
            } else if (EffectsDanmakuEvent$Page.getMaxHeight(getContext()) < qa00.m175859d(132.0f) + i) {
                this.f49653k.m170886b4(-((qa00.m175859d(132.0f) + i) - EffectsDanmakuEvent$Page.getMaxHeight(getContext())));
            }
        }
        bnl0.m105524M(this.f49650h, this.f49661s);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(p6g0 p6g0Var) {
        this.f49653k = p6g0Var;
    }

    /* JADX INFO: renamed from: y */
    public void m73749y() {
        this.f49648f.setText("");
    }

    /* JADX INFO: renamed from: z */
    public final boolean m73750z() {
        p6g0 p6g0Var = this.f49653k;
        return p6g0Var != null && p6g0Var.m170877S3() >= 0;
    }
}
