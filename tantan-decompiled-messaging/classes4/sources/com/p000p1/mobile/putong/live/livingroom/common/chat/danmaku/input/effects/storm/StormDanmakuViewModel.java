package com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm;

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
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuViewModel;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveStormDanmaku;
import com.p1.mobile.putong.live.base.data.BLiveStormDanmakuResource;
import com.p1.mobile.putong.live.base.data.BLiveStormDanmakuTip;
import com.p1.mobile.putong.live.base.data.BLiveStormDanmakuTipContent;
import com.p1.mobile.putong.live.base.view.RatioLayout;
import java.io.IOException;
import l.e30;
import l.j760;
import l.lsi0;
import l.mep0;
import l.s7m;
import l.t0g0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.xlf0;
import l.yb2;
import l.ypv;
import p002l.azf0;
import p002l.iyf0;
import p002l.k25;
import p002l.oyf0;
import v.VEditText;
import v.VImage;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class StormDanmakuViewModel extends LinearLayout implements s7m<iyf0> {

    /* JADX INFO: renamed from: a */
    public VImage f4837a;

    /* JADX INFO: renamed from: b */
    public VImage f4838b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f4839c;

    /* JADX INFO: renamed from: d */
    public RatioLayout f4840d;

    /* JADX INFO: renamed from: e */
    public TextureView f4841e;

    /* JADX INFO: renamed from: f */
    public VEditText f4842f;

    /* JADX INFO: renamed from: g */
    public VText f4843g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f4844h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f4845i;

    /* JADX INFO: renamed from: j */
    public VText f4846j;

    /* JADX INFO: renamed from: k */
    public iyf0 f4847k;

    /* JADX INFO: renamed from: l */
    public BLiveStormDanmaku f4848l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public oyf0 f4849m;

    /* JADX INFO: renamed from: n */
    public final Drawable f4850n;

    /* JADX INFO: renamed from: o */
    public final Drawable f4851o;

    /* JADX INFO: renamed from: p */
    public MediaPlayer f4852p;

    /* JADX INFO: renamed from: q */
    public Surface f4853q;

    /* JADX INFO: renamed from: r */
    @Nullable
    public Runnable f4854r;

    /* JADX INFO: renamed from: s */
    public boolean f4855s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuViewModel$a */
    public class C0330a implements TextWatcher {
        public C0330a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            StormDanmakuViewModel.this.m6024L();
            StormDanmakuViewModel.this.m6025N(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.storm.StormDanmakuViewModel$b */
    public class TextureViewSurfaceTextureListenerC0331b implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC0331b() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            StormDanmakuViewModel.this.f4853q = new Surface(surfaceTexture);
            if (StormDanmakuViewModel.this.f4854r != null) {
                StormDanmakuViewModel.this.f4854r.run();
                StormDanmakuViewModel.this.f4854r = null;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            StormDanmakuViewModel.this.m6057S();
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
        int i = t100.k;
        this.f4850n = yb2.a(436207615, i, false);
        this.f4851o = yb2.a(-30697, i, false);
        this.f4855s = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m6023B(View view) {
        m6043A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public void m6024L() {
        boolean z = m6063z() || (this.f4842f.getText() != null && k25.m16466b(this.f4842f.getText().toString()).length() > 0);
        this.f4846j.setBackground(z ? this.f4851o : this.f4850n);
        this.f4846j.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public void m6025N(Editable editable) {
        int length = editable == null ? 0 : editable.toString().length();
        this.f4843g.setText(length + "/15");
    }

    /* JADX INFO: renamed from: Q */
    private void m6026Q() {
        BLiveStormDanmaku bLiveStormDanmaku = this.f4848l;
        if (bLiveStormDanmaku == null || vwb.J(bLiveStormDanmaku.resources)) {
            return;
        }
        BLiveStormDanmakuResource bLiveStormDanmakuResource = (BLiveStormDanmakuResource) this.f4848l.resources.get(0);
        j760<String, String> inputText = getInputText();
        this.f4847k.m15524Z3((String) inputText.a, (String) inputText.b, bLiveStormDanmakuResource);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m6031e(StringBuilder sb, BLiveStormDanmakuTipContent bLiveStormDanmakuTipContent) {
        String str = "{" + bLiveStormDanmakuTipContent.key + "}";
        int iIndexOf = sb.indexOf(str);
        if (iIndexOf >= 0) {
            sb.replace(iIndexOf, str.length() + iIndexOf, bLiveStormDanmakuTipContent.value);
        }
    }

    private j760<String, String> getInputText() {
        oyf0 oyf0Var;
        int iM15515S3 = this.f4847k.m15515S3();
        if (iM15515S3 < 0 || (oyf0Var = this.f4849m) == null || iM15515S3 >= oyf0Var.m19901C()) {
            return vwb.Y(this.f4842f.getText() == null ? "" : this.f4842f.getText().toString(), "");
        }
        BLiveStormDanmakuTip item = this.f4849m.getItem(iM15515S3);
        final StringBuilder sb = new StringBuilder(item.text);
        if (!vwb.J(item.fields)) {
            vwb.z(item.fields, new e30() { // from class: l.pyf0
                public final void call(Object obj) {
                    StormDanmakuViewModel.m6031e(sb, (BLiveStormDanmakuTipContent) obj);
                }
            });
        }
        return vwb.Y(sb.toString(), item.id);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ CharSequence m6033i(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = 15 - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            lsi0.y(ypv.e.getString(R$string.f2737G6, 15));
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        return (Character.isHighSurrogate(charSequence.charAt(i5 + (-1))) && (i5 = i5 + (-1)) == i) ? "" : charSequence.subSequence(i, i5);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ CharSequence m6034j(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        char[] charArray = charSequence.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (!t0g0.i(c)) {
                sb.append(c);
            }
        }
        if (TextUtils.isEmpty(sb)) {
            return "";
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public void m6043A() {
        Act act = act();
        if (act != null) {
            act.hideInput(this.f4842f);
        }
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ boolean m6044C(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        m6026Q();
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6045C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m6046E(View view) {
        this.f4847k.m15520W3();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m6047F(View view) {
        if (view.isEnabled()) {
            m6026Q();
        }
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m6048G(View view) {
        this.f4847k.m15513P3();
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m6049H(View view) {
        this.f4847k.m15525a4();
    }

    /* JADX INFO: renamed from: J */
    public boolean m6051J() {
        if (this.f4855s) {
            return false;
        }
        m6043A();
        return true;
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final void m6050I(final String str) {
        if (this.f4853q == null) {
            this.f4854r = new Runnable() { // from class: l.zyf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23669a.m6050I(str);
                }
            };
            return;
        }
        MediaPlayer mediaPlayer = this.f4852p;
        if (mediaPlayer == null) {
            this.f4852p = new MediaPlayer();
        } else {
            mediaPlayer.reset();
        }
        this.f4852p.setSurface(this.f4853q);
        try {
            this.f4852p.setDataSource(str);
            this.f4852p.setLooping(true);
            this.f4852p.prepareAsync();
            this.f4852p.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: l.qyf0
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    mediaPlayer2.start();
                }
            });
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m6053M() {
        boolean zM6063z = m6063z();
        this.f4842f.setTextColor(zM6063z ? -2130706433 : -1);
        this.f4842f.setCursorVisible(!zM6063z);
    }

    /* JADX INFO: renamed from: O */
    public void m6054O() {
        oyf0 oyf0Var = this.f4849m;
        if (oyf0Var != null) {
            oyf0Var.notifyDataSetChanged();
        }
        m6024L();
        m6053M();
    }

    /* JADX INFO: renamed from: P */
    public void m6055P(BLiveStormDanmaku bLiveStormDanmaku) {
        this.f4848l = bLiveStormDanmaku;
        oyf0 oyf0Var = new oyf0(this.f4847k, bLiveStormDanmaku.defaultComments);
        this.f4849m = oyf0Var;
        this.f4845i.setAdapter(oyf0Var);
        if (!vwb.J(bLiveStormDanmaku.resources)) {
            BLiveStormDanmakuResource bLiveStormDanmakuResource = (BLiveStormDanmakuResource) bLiveStormDanmaku.resources.get(0);
            this.f4846j.setText(String.format(getResources().getString(R$string.f3258ee), bLiveStormDanmakuResource.price));
            String str = bLiveStormDanmakuResource.bgUrl;
            if (!TextUtils.isEmpty(str)) {
                m6050I(str);
            }
            this.f4842f.setHint(bLiveStormDanmakuResource.placeholderText);
        }
        m6024L();
    }

    /* JADX INFO: renamed from: R */
    public void m6056R(boolean z) {
        xdl0.M(this.f4837a, z);
    }

    /* JADX INFO: renamed from: S */
    public final void m6057S() {
        MediaPlayer mediaPlayer = this.f4852p;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f4852p.stop();
            }
            this.f4852p.release();
            this.f4852p = null;
        }
    }

    public void destroy() {
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6059v(this);
        setOnClickListener(new View.OnClickListener() { // from class: l.ryf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18722a.m6023B(view);
            }
        });
        RatioLayout ratioLayout = this.f4840d;
        int i = t100.k;
        ratioLayout.setBackground(yb2.b(150994943, -3355444, i, i, 0.0f, 0.0f, false, false));
        this.f4842f.setFilters(new InputFilter[]{new InputFilter() { // from class: l.syf0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                return StormDanmakuViewModel.m6034j(charSequence, i2, i3, spanned, i4, i5);
            }
        }, new InputFilter() { // from class: l.tyf0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
                return StormDanmakuViewModel.m6033i(charSequence, i2, i3, spanned, i4, i5);
            }
        }});
        this.f4842f.addTextChangedListener(new C0330a());
        this.f4842f.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.uyf0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return this.f20879a.m6044C(textView, i2, keyEvent);
            }
        });
        this.f4842f.setOnClickListener(new View.OnClickListener() { // from class: l.vyf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21381a.m6046E(view);
            }
        });
        this.f4846j.setOnClickListener(new View.OnClickListener() { // from class: l.wyf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22041a.m6047F(view);
            }
        });
        m6025N(this.f4842f.getText());
        this.f4845i.setHasFixedSize(true);
        this.f4845i.setOverScrollMode(2);
        this.f4845i.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f4845i.addItemDecoration(new xlf0(t100.h, t100.o));
        this.f4841e.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC0331b());
        mep0.c1(this.f4841e, 0, 0, 0, -i, i);
        this.f4837a.setOnClickListener(new View.OnClickListener() { // from class: l.xyf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22507a.m6048G(view);
            }
        });
        this.f4838b.setOnClickListener(new View.OnClickListener() { // from class: l.yyf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23145a.m6049H(view);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m6059v(View view) {
        azf0.m10138a(this, view);
    }

    /* JADX INFO: renamed from: w */
    public void m6060w(int i) {
        boolean z = i == 0;
        this.f4855s = z;
        xdl0.M(this.f4840d, z);
        this.f4839c.scrollTo(0, this.f4855s ? 0 : -t100.h);
        iyf0 iyf0Var = this.f4847k;
        if (iyf0Var != null) {
            if (this.f4855s) {
                iyf0Var.m15526b4(0);
            } else if (EffectsDanmakuEvent$Page.getMaxHeight(m6045C0()) < t100.d(132.0f) + i) {
                this.f4847k.m15526b4(-((t100.d(132.0f) + i) - EffectsDanmakuEvent$Page.getMaxHeight(m6045C0())));
            }
        }
        xdl0.M(this.f4844h, this.f4855s);
    }

    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void m6058i1(iyf0 iyf0Var) {
        this.f4847k = iyf0Var;
    }

    /* JADX INFO: renamed from: y */
    public void m6062y() {
        this.f4842f.setText("");
    }

    /* JADX INFO: renamed from: z */
    public final boolean m6063z() {
        iyf0 iyf0Var = this.f4847k;
        return iyf0Var != null && iyf0Var.m15515S3() >= 0;
    }
}
