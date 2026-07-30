package com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmaku;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuResource;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuTip;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuTipContent;
import com.p046p1.mobile.putong.live.base.view.RatioLayout;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuViewModel;
import java.io.IOException;
import p147v.VEditText;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.azf0;
import p149l.e30;
import p149l.iyf0;
import p149l.j760;
import p149l.k25;
import p149l.lsi0;
import p149l.mep0;
import p149l.oyf0;
import p149l.s7m;
import p149l.t0g0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.xlf0;
import p149l.yb2;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class StormDanmakuViewModel extends LinearLayout implements s7m<iyf0> {

    /* JADX INFO: renamed from: a */
    public VImage f48795a;

    /* JADX INFO: renamed from: b */
    public VImage f48796b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f48797c;

    /* JADX INFO: renamed from: d */
    public RatioLayout f48798d;

    /* JADX INFO: renamed from: e */
    public TextureView f48799e;

    /* JADX INFO: renamed from: f */
    public VEditText f48800f;

    /* JADX INFO: renamed from: g */
    public VText f48801g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f48802h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f48803i;

    /* JADX INFO: renamed from: j */
    public VText f48804j;

    /* JADX INFO: renamed from: k */
    public iyf0 f48805k;

    /* JADX INFO: renamed from: l */
    public BLiveStormDanmaku f48806l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public oyf0 f48807m;

    /* JADX INFO: renamed from: n */
    public final Drawable f48808n;

    /* JADX INFO: renamed from: o */
    public final Drawable f48809o;

    /* JADX INFO: renamed from: p */
    public MediaPlayer f48810p;

    /* JADX INFO: renamed from: q */
    public Surface f48811q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public Runnable f48812r;

    /* JADX INFO: renamed from: s */
    public boolean f48813s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuViewModel$a */
    public class C12741a implements TextWatcher {
        public C12741a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            StormDanmakuViewModel.this.m72530L();
            StormDanmakuViewModel.this.m72531N(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuViewModel$b */
    public class TextureViewSurfaceTextureListenerC12742b implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC12742b() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            StormDanmakuViewModel.this.f48811q = new Surface(surfaceTexture);
            if (StormDanmakuViewModel.this.f48812r != null) {
                StormDanmakuViewModel.this.f48812r.run();
                StormDanmakuViewModel.this.f48812r = null;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            StormDanmakuViewModel.this.m72562S();
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
        int i = t100.f167262k;
        this.f48808n = yb2.m213876a(436207615, i, false);
        this.f48809o = yb2.m213876a(-30697, i, false);
        this.f48813s = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m72529B(View view) {
        m72549A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public void m72530L() {
        boolean z = m72567z() || (this.f48800f.getText() != null && k25.m144261b(this.f48800f.getText().toString()).length() > 0);
        this.f48804j.setBackground(z ? this.f48809o : this.f48808n);
        this.f48804j.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public void m72531N(Editable editable) {
        int length = editable == null ? 0 : editable.toString().length();
        this.f48801g.setText(length + "/15");
    }

    /* JADX INFO: renamed from: Q */
    private void m72532Q() {
        BLiveStormDanmaku bLiveStormDanmaku = this.f48806l;
        if (bLiveStormDanmaku == null || vwb.m200296J(bLiveStormDanmaku.resources)) {
            return;
        }
        BLiveStormDanmakuResource bLiveStormDanmakuResource = this.f48806l.resources.get(0);
        j760<String, String> inputText = getInputText();
        this.f48805k.m138981Z3(inputText.f116564a, inputText.f116565b, bLiveStormDanmakuResource);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m72537e(StringBuilder sb, BLiveStormDanmakuTipContent bLiveStormDanmakuTipContent) {
        String str = "{" + bLiveStormDanmakuTipContent.key + "}";
        int iIndexOf = sb.indexOf(str);
        if (iIndexOf >= 0) {
            sb.replace(iIndexOf, str.length() + iIndexOf, bLiveStormDanmakuTipContent.value);
        }
    }

    private j760<String, String> getInputText() {
        oyf0 oyf0Var;
        int iM138972S3 = this.f48805k.m138972S3();
        if (iM138972S3 < 0 || (oyf0Var = this.f48807m) == null || iM138972S3 >= oyf0Var.mo28824C()) {
            return vwb.m200311Y(this.f48800f.getText() == null ? "" : this.f48800f.getText().toString(), "");
        }
        BLiveStormDanmakuTip item = this.f48807m.getItem(iM138972S3);
        final StringBuilder sb = new StringBuilder(item.text);
        if (!vwb.m200296J(item.fields)) {
            vwb.m200354z(item.fields, new e30() { // from class: l.pyf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    StormDanmakuViewModel.m72537e(sb, (BLiveStormDanmakuTipContent) obj);
                }
            });
        }
        return vwb.m200311Y(sb.toString(), item.f44448id);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ CharSequence m72539i(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = 15 - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f46695G6, 15));
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        return (Character.isHighSurrogate(charSequence.charAt(i5 + (-1))) && (i5 = i5 + (-1)) == i) ? "" : charSequence.subSequence(i, i5);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ CharSequence m72540j(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        char[] charArray = charSequence.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (!t0g0.m186868i(c)) {
                sb.append(c);
            }
        }
        if (TextUtils.isEmpty(sb)) {
            return "";
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public void m72549A() {
        Act act = act();
        if (act != null) {
            act.hideInput(this.f48800f);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ boolean m72550C(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        m72532Q();
        return true;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m72551E(View view) {
        this.f48805k.m138977W3();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m72552F(View view) {
        if (view.isEnabled()) {
            m72532Q();
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m72553G(View view) {
        this.f48805k.m138970P3();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m72554H(View view) {
        this.f48805k.m138982a4();
    }

    /* JADX INFO: renamed from: J */
    public boolean m72556J() {
        if (this.f48813s) {
            return false;
        }
        m72549A();
        return true;
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void m72555I(final String str) {
        if (this.f48811q == null) {
            this.f48812r = new Runnable() { // from class: l.zyf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f205677a.m72555I(str);
                }
            };
            return;
        }
        MediaPlayer mediaPlayer = this.f48810p;
        if (mediaPlayer == null) {
            this.f48810p = new MediaPlayer();
        } else {
            mediaPlayer.reset();
        }
        this.f48810p.setSurface(this.f48811q);
        try {
            this.f48810p.setDataSource(str);
            this.f48810p.setLooping(true);
            this.f48810p.prepareAsync();
            this.f48810p.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: l.qyf0
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    mediaPlayer2.start();
                }
            });
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m72558M() {
        boolean zM72567z = m72567z();
        this.f48800f.setTextColor(zM72567z ? -2130706433 : -1);
        this.f48800f.setCursorVisible(!zM72567z);
    }

    /* JADX INFO: renamed from: O */
    public void m72559O() {
        oyf0 oyf0Var = this.f48807m;
        if (oyf0Var != null) {
            oyf0Var.notifyDataSetChanged();
        }
        m72530L();
        m72558M();
    }

    /* JADX INFO: renamed from: P */
    public void m72560P(BLiveStormDanmaku bLiveStormDanmaku) {
        this.f48806l = bLiveStormDanmaku;
        oyf0 oyf0Var = new oyf0(this.f48805k, bLiveStormDanmaku.defaultComments);
        this.f48807m = oyf0Var;
        this.f48803i.setAdapter(oyf0Var);
        if (!vwb.m200296J(bLiveStormDanmaku.resources)) {
            BLiveStormDanmakuResource bLiveStormDanmakuResource = bLiveStormDanmaku.resources.get(0);
            this.f48804j.setText(String.format(getResources().getString(R$string.f47216ee), bLiveStormDanmakuResource.price));
            String str = bLiveStormDanmakuResource.bgUrl;
            if (!TextUtils.isEmpty(str)) {
                m72555I(str);
            }
            this.f48800f.setHint(bLiveStormDanmakuResource.placeholderText);
        }
        m72530L();
    }

    /* JADX INFO: renamed from: R */
    public void m72561R(boolean z) {
        xdl0.m208344M(this.f48795a, z);
    }

    /* JADX INFO: renamed from: S */
    public final void m72562S() {
        MediaPlayer mediaPlayer = this.f48810p;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f48810p.stop();
            }
            this.f48810p.release();
            this.f48810p = null;
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72563v(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.ryf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161558a.m72529B(view);
            }
        });
        RatioLayout ratioLayout = this.f48798d;
        int i = t100.f167262k;
        ratioLayout.setBackground(yb2.m213877b(150994943, -3355444, i, i, 0.0f, 0.0f, false, false));
        this.f48800f.setFilters(new InputFilter[]{new InputFilter() { // from class: l.syf0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                return StormDanmakuViewModel.m72540j(charSequence, i2, i3, spanned, i4, i5);
            }
        }, new InputFilter() { // from class: l.tyf0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                return StormDanmakuViewModel.m72539i(charSequence, i2, i3, spanned, i4, i5);
            }
        }});
        this.f48800f.addTextChangedListener(new C12741a());
        this.f48800f.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.uyf0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return this.f178861a.m72550C(textView, i2, keyEvent);
            }
        });
        this.f48800f.setOnClickListener(new View.OnClickListener() { // from class: l.vyf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183521a.m72551E(view);
            }
        });
        this.f48804j.setOnClickListener(new View.OnClickListener() { // from class: l.wyf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188559a.m72552F(view);
            }
        });
        m72531N(this.f48800f.getText());
        this.f48803i.setHasFixedSize(true);
        this.f48803i.setOverScrollMode(2);
        this.f48803i.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f48803i.addItemDecoration(new xlf0(t100.f167259h, t100.f167266o));
        this.f48799e.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC12742b());
        mep0.m154301c1(this.f48799e, 0, 0, 0, -i, i);
        this.f48795a.setOnClickListener(new View.OnClickListener() { // from class: l.xyf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195050a.m72553G(view);
            }
        });
        this.f48796b.setOnClickListener(new View.OnClickListener() { // from class: l.yyf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200730a.m72554H(view);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m72563v(View view) {
        azf0.m99663a(this, view);
    }

    /* JADX INFO: renamed from: w */
    public void m72564w(int i) {
        boolean z = i == 0;
        this.f48813s = z;
        xdl0.m208344M(this.f48798d, z);
        this.f48797c.scrollTo(0, this.f48813s ? 0 : -t100.f167259h);
        iyf0 iyf0Var = this.f48805k;
        if (iyf0Var != null) {
            if (this.f48813s) {
                iyf0Var.m138983b4(0);
            } else if (EffectsDanmakuEvent$Page.getMaxHeight(getContext()) < t100.m186890d(132.0f) + i) {
                this.f48805k.m138983b4(-((t100.m186890d(132.0f) + i) - EffectsDanmakuEvent$Page.getMaxHeight(getContext())));
            }
        }
        xdl0.m208344M(this.f48802h, this.f48813s);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(iyf0 iyf0Var) {
        this.f48805k = iyf0Var;
    }

    /* JADX INFO: renamed from: y */
    public void m72566y() {
        this.f48800f.setText("");
    }

    /* JADX INFO: renamed from: z */
    public final boolean m72567z() {
        iyf0 iyf0Var = this.f48805k;
        return iyf0Var != null && iyf0Var.m138972S3() >= 0;
    }
}
