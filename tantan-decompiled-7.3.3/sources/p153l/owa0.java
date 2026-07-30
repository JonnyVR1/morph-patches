package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class owa0 extends bpe {
    public owa0(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ int m169543W(LiteraturesComments literaturesComments, LiteraturesComments literaturesComments2) {
        return (int) (literaturesComments2.updatedTime - literaturesComments.updatedTime);
    }

    /* JADX INFO: renamed from: a0 */
    public static /* synthetic */ int m169547a0(List list, final LiteraturesComments literaturesComments, final LiteraturesComments literaturesComments2) {
        LiteraturesComments literaturesComments3 = (LiteraturesComments) jyb.m147529r(list, new qcj() { // from class: l.mwa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiteraturesComments) obj).literatureID, literaturesComments.literatureID));
            }
        });
        LiteraturesComments literaturesComments4 = (LiteraturesComments) jyb.m147529r(list, new qcj() { // from class: l.nwa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiteraturesComments) obj).literatureID, literaturesComments2.literatureID));
            }
        });
        if (NullChecker.m82486a(literaturesComments3) && NullChecker.m82486a(literaturesComments4)) {
            return (int) (literaturesComments4.updatedTime - literaturesComments3.updatedTime);
        }
        return 0;
    }

    @Override // p153l.bpe
    /* JADX INFO: renamed from: U */
    public void mo105811U() {
        if (jyb.m147479J(this.f77760F)) {
            return;
        }
        if (!mo53983O().mo52258P1()) {
            mo53983O().act().duringCreated(C22421c.just(BookMoviesDramasHelper.m60629l(CoreModule.m30929H().userId()))).subscribe(psd0.m173596G(new y20() { // from class: l.iwa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f117260a.m169548b0((List) obj);
                }
            }));
        }
        this.f77759E = BookMoviesDramasHelper.m60628k(this.f77760F);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m169548b0(final List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (final LiteraturesComments literaturesComments : this.f77760F) {
            if (NullChecker.m82486a((LiteraturesComments) jyb.m147529r(list, new qcj() { // from class: l.jwa0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((LiteraturesComments) obj).literatureID, literaturesComments.literatureID));
                }
            }))) {
                arrayList.add(literaturesComments);
            } else {
                arrayList2.add(literaturesComments);
            }
        }
        Collections.sort(arrayList, new Comparator() { // from class: l.kwa0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return owa0.m169547a0(list, (LiteraturesComments) obj, (LiteraturesComments) obj2);
            }
        });
        Collections.sort(arrayList2, new Comparator() { // from class: l.lwa0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return owa0.m169543W((LiteraturesComments) obj, (LiteraturesComments) obj2);
            }
        });
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.f77760F = arrayList3;
    }

    @Override // p153l.bpe, p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f77763v.setTextSize(18.0f);
        this.f77763v.setTextColor(Color.parseColor("#e6000000"));
    }

    @Override // p153l.bpe, p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        pf60<List<Literatures>, List<LiteraturesComments>> pf60VarMo52245H3 = mo53983O().mo52245H3();
        if (NullChecker.m82486a(pf60VarMo52245H3)) {
            this.f77760F = pf60VarMo52245H3.f152157b;
        }
        return (mo53983O().mo52302m0() || jyb.m147479J(this.f77760F)) ? false : true;
    }
}
