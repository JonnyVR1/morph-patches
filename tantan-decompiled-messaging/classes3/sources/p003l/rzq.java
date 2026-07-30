package p003l;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.p000p1.mobile.putong.core.p001ui.messages.meme.KeyboardPagerAdapterPage;
import java.util.List;
import l.l6c0;
import l.o7r;
import l.x1c0;
import l.y4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@RequiresApi(19)
public class rzq extends eb2 implements KeyboardPagerAdapterPage.InterfaceC0123b<String>, View.OnClickListener {

    /* JADX INFO: renamed from: e */
    public final List<String> f7119e;

    /* JADX INFO: renamed from: f */
    public final e30<CharSequence> f7120f;

    public rzq(List<String> list, e30<CharSequence> e30Var) {
        this.f7119e = list;
        this.f7120f = e30Var;
    }

    public int getCount() {
        return (int) Math.ceil(((double) this.f7119e.size()) / 31.0d);
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    @Override // p003l.eb2
    /* JADX INFO: renamed from: o */
    public void mo923o(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f7120f.call((CharSequence) view.getTag());
    }

    @Override // p003l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo924p(ViewGroup viewGroup, int i) {
        List<String> listM7406r = m7406r(i);
        KeyboardPagerAdapterPage keyboardPagerAdapterPage = new KeyboardPagerAdapterPage(viewGroup.getContext());
        keyboardPagerAdapterPage.m2371b(8, 4, viewGroup.getContext().getResources().getDimensionPixelSize(x1c0.k), listM7406r, this, true);
        viewGroup.addView(keyboardPagerAdapterPage);
        return keyboardPagerAdapterPage;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.meme.KeyboardPagerAdapterPage.InterfaceC0123b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public View mo2376i(String str, Context context) {
        View viewInflate = o7r.a(context).inflate(l6c0.p5, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(y4c0.A4)).setText(eoj0.m3914c(str));
        viewInflate.setTag(str);
        viewInflate.setOnClickListener(this);
        return viewInflate;
    }

    /* JADX INFO: renamed from: r */
    public final List<String> m7406r(int i) {
        int i2 = i * 31;
        return this.f7119e.subList(i2, Math.min(i2 + 31, this.f7119e.size()));
    }
}
