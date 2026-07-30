package p153l;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.newui.loveletter.C8238a;
import com.p051p1.mobile.putong.core.newui.loveletter.search.LoveLetterSearchAct;
import com.p051p1.mobile.putong.core.p058ui.messages.emoji.VEditTextEmojiCompat;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class dew implements iam<vdw> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f88088a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f88089b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f88090c;

    /* JADX INFO: renamed from: d */
    public VText f88091d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f88092e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f88093f;

    /* JADX INFO: renamed from: g */
    public VEditTextEmojiCompat f88094g;

    /* JADX INFO: renamed from: h */
    public VImage f88095h;

    /* JADX INFO: renamed from: i */
    public VImage f88096i;

    /* JADX INFO: renamed from: j */
    public VText f88097j;

    /* JADX INFO: renamed from: k */
    public kcg0 f88098k;

    /* JADX INFO: renamed from: l */
    public LoveLetterSearchAct f88099l;

    /* JADX INFO: renamed from: m */
    public vdw f88100m;

    /* JADX INFO: renamed from: n */
    public C8238a f88101n;

    public dew(LoveLetterSearchAct loveLetterSearchAct) {
        this.f88099l = loveLetterSearchAct;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m115473c(TextView textView, int i, KeyEvent keyEvent) {
        return i == 6;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m115475e(final EditText editText, gcg0 gcg0Var) {
        final C16512a c16512a = new C16512a(gcg0Var);
        editText.addTextChangedListener(c16512a);
        gcg0Var.m129866b(pcg0.m171648a(new x20() { // from class: l.cew
            @Override // p153l.x20
            public final void call() {
                editText.removeTextChangedListener(c16512a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m115477k(View view) {
        this.f88099l.hideInput(this.f88094g);
        this.f88094g.clearFocus();
        this.f88099l.m45660g2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m115478l(View view) {
        this.f88094g.setText("");
        bnl0.m105524M(this.f88096i, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m115479m(CharSequence charSequence) {
        if (this.f88100m != null) {
            String strTrim = charSequence.toString().trim();
            if (TextUtils.isEmpty(charSequence.toString()) || !TextUtils.isEmpty(strTrim)) {
                this.f88100m.m201006l0(charSequence.toString().trim());
            } else {
                this.f88100m.m201006l0("");
                this.f88094g.setText("");
            }
            bnl0.m105524M(this.f88096i, !TextUtils.isEmpty(strTrim));
        }
    }

    /* JADX INFO: renamed from: q */
    public static C22421c<CharSequence> m115480q(final EditText editText) {
        return C22421c.create(new C22421c.a() { // from class: l.bew
            @Override // p153l.y20
            public final void call(Object obj) {
                dew.m115475e(editText, (gcg0) obj);
            }
        }).compose(psd0.m173607R());
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f88099l;
    }

    @Override // p153l.iam
    public Act act() {
        return this.f88099l;
    }

    @Override // p153l.iam
    public void destroy() {
        psd0.m173633z(this.f88098k);
    }

    /* JADX INFO: renamed from: i */
    public View m115481i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return eew.m120571b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m115481i(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(vdw vdwVar) {
        this.f88100m = vdwVar;
    }

    /* JADX INFO: renamed from: n */
    public void m115483n(List<Conversation> list) {
        this.f88101n.m40618R(list);
        m115484p(jyb.m147479J(list));
    }

    /* JADX INFO: renamed from: p */
    public void m115484p(boolean z) {
        bnl0.m105524M(this.f88090c, z);
        bnl0.m105524M(this.f88089b, !z);
    }

    /* JADX INFO: renamed from: r */
    public void m115485r() {
        LoveLetterSearchAct loveLetterSearchAct = this.f88099l;
        final VEditTextEmojiCompat vEditTextEmojiCompat = this.f88094g;
        Objects.requireNonNull(vEditTextEmojiCompat);
        loveLetterSearchAct.post(new Runnable() { // from class: l.wdw
            @Override // java.lang.Runnable
            public final void run() {
                vEditTextEmojiCompat.requestFocus();
            }
        });
        this.f88091d.setText("抱歉，暂无匹配结果");
        this.f88094g.setSpaceHint("输入昵称");
        bnl0.m105509E0(this.f88097j, new View.OnClickListener() { // from class: l.xdw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193650a.m115477k(view);
            }
        });
        bnl0.m105509E0(this.f88096i, new View.OnClickListener() { // from class: l.ydw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198630a.m115478l(view);
            }
        });
        this.f88101n = new C8238a(this.f88100m, this.f88089b);
        this.f88089b.setLayoutManager(new GridLayoutManager(this.f88099l, 2));
        this.f88089b.setAdapter(this.f88101n);
        this.f88098k = this.f88099l.duringCreated(m115480q(this.f88094g)).throttleLast(500L, TimeUnit.MILLISECONDS).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.zdw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203948a.m115479m((CharSequence) obj);
            }
        }));
        this.f88094g.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.aew
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return dew.m115473c(textView, i, keyEvent);
            }
        });
        this.f88088a.setPadding(0, qa00.m175859d(48.0f), 0, 0);
    }

    /* JADX INFO: renamed from: l.dew$a */
    public class C16512a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gcg0 f88102a;

        public C16512a(gcg0 gcg0Var) {
            this.f88102a = gcg0Var;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f88102a.onNext(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
