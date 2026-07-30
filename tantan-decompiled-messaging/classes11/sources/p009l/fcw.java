package p009l;

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
import com.p000p1.mobile.putong.core.newui.loveletter.C0251a;
import com.p000p1.mobile.putong.core.newui.loveletter.search.LoveLetterSearchAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.ui.messages.emoji.VEditTextEmojiCompat;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.d30;
import l.e30;
import l.gcw;
import l.h4g0;
import l.jo0;
import l.mkd0;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.z3g0;
import rx.c;
import v.VImage;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class fcw implements s7m<xbw> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f12924a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f12925b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f12926c;

    /* JADX INFO: renamed from: d */
    public VText f12927d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f12928e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f12929f;

    /* JADX INFO: renamed from: g */
    public VEditTextEmojiCompat f12930g;

    /* JADX INFO: renamed from: h */
    public VImage f12931h;

    /* JADX INFO: renamed from: i */
    public VImage f12932i;

    /* JADX INFO: renamed from: j */
    public VText f12933j;

    /* JADX INFO: renamed from: k */
    public c4g0 f12934k;

    /* JADX INFO: renamed from: l */
    public LoveLetterSearchAct f12935l;

    /* JADX INFO: renamed from: m */
    public xbw f12936m;

    /* JADX INFO: renamed from: n */
    public C0251a f12937n;

    public fcw(LoveLetterSearchAct loveLetterSearchAct) {
        this.f12935l = loveLetterSearchAct;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m14361c(TextView textView, int i, KeyEvent keyEvent) {
        return i == 6;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m14363e(final EditText editText, z3g0 z3g0Var) {
        final C0895a c0895a = new C0895a(z3g0Var);
        editText.addTextChangedListener(c0895a);
        z3g0Var.b(h4g0.a(new d30() { // from class: l.ecw
            public final void call() {
                editText.removeTextChangedListener(c0895a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m14365k(View view) {
        this.f12935l.hideInput(this.f12930g);
        this.f12930g.clearFocus();
        this.f12935l.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m14366l(View view) {
        this.f12930g.setText("");
        xdl0.M(this.f12932i, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m14367m(CharSequence charSequence) {
        if (this.f12936m != null) {
            String strTrim = charSequence.toString().trim();
            if (TextUtils.isEmpty(charSequence.toString()) || !TextUtils.isEmpty(strTrim)) {
                this.f12936m.m24766l0(charSequence.toString().trim());
            } else {
                this.f12936m.m24766l0("");
                this.f12930g.setText("");
            }
            xdl0.M(this.f12932i, !TextUtils.isEmpty(strTrim));
        }
    }

    /* JADX INFO: renamed from: q */
    public static c<CharSequence> m14368q(final EditText editText) {
        return c.create(new c.a() { // from class: l.dcw
            public final void call(Object obj) {
                fcw.m14363e(editText, (z3g0) obj);
            }
        }).compose(mkd0.R());
    }

    /* JADX INFO: renamed from: C0 */
    public Context m14369C0() {
        return this.f12935l;
    }

    public Act act() {
        return this.f12935l;
    }

    public void destroy() {
        mkd0.z(this.f12934k);
    }

    /* JADX INFO: renamed from: i */
    public View m14370i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gcw.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m14370i(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m14371i1(xbw xbwVar) {
        this.f12936m = xbwVar;
    }

    /* JADX INFO: renamed from: n */
    public void m14373n(List<Conversation> list) {
        this.f12937n.m3689R(list);
        m14374p(vwb.J(list));
    }

    /* JADX INFO: renamed from: p */
    public void m14374p(boolean z) {
        xdl0.M(this.f12926c, z);
        xdl0.M(this.f12925b, !z);
    }

    /* JADX INFO: renamed from: r */
    public void m14375r() {
        LoveLetterSearchAct loveLetterSearchAct = this.f12935l;
        final VEditTextEmojiCompat vEditTextEmojiCompat = this.f12930g;
        Objects.requireNonNull(vEditTextEmojiCompat);
        loveLetterSearchAct.post(new Runnable() { // from class: l.ybw
            @Override // java.lang.Runnable
            public final void run() {
                vEditTextEmojiCompat.requestFocus();
            }
        });
        this.f12927d.setText("抱歉，暂无匹配结果");
        this.f12930g.setSpaceHint("输入昵称");
        xdl0.E0(this.f12933j, new View.OnClickListener() { // from class: l.zbw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23555a.m14365k(view);
            }
        });
        xdl0.E0(this.f12932i, new View.OnClickListener() { // from class: l.acw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9406a.m14366l(view);
            }
        });
        this.f12937n = new C0251a(this.f12936m, this.f12925b);
        this.f12925b.setLayoutManager(new GridLayoutManager(this.f12935l, 2));
        this.f12925b.setAdapter(this.f12937n);
        this.f12934k = this.f12935l.duringCreated(m14368q(this.f12930g)).throttleLast(500L, TimeUnit.MILLISECONDS).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.bcw
            public final void call(Object obj) {
                this.f10017a.m14367m((CharSequence) obj);
            }
        }));
        this.f12930g.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l.ccw
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return fcw.m14361c(textView, i, keyEvent);
            }
        });
        this.f12924a.setPadding(0, t100.d(48.0f), 0, 0);
    }

    /* JADX INFO: renamed from: l.fcw$a */
    public class C0895a implements TextWatcher {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f12938a;

        public C0895a(z3g0 z3g0Var) {
            this.f12938a = z3g0Var;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f12938a.onNext(charSequence);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
