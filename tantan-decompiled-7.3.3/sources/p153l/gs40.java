package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardUserContentView;
import p151v.AutoVDraweeView;
import p151v.VPager;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class gs40 {
    /* JADX INFO: renamed from: a */
    public static void m131957a(fs40 fs40Var, View view) {
        fs40Var.f100525a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fs40Var.f100526b = (AutoVDraweeView) viewGroup.getChildAt(0);
        fs40Var.f100527c = (AutoVDraweeView) viewGroup.getChildAt(1);
        fs40Var.f100528d = (ImageView) viewGroup.getChildAt(2);
        fs40Var.f100529e = (TextView) viewGroup.getChildAt(3);
        fs40Var.f100530f = (VText) viewGroup.getChildAt(4);
        fs40Var.f100531g = viewGroup.getChildAt(5);
        fs40Var.f100532h = (VPager) viewGroup.getChildAt(6);
        fs40Var.f100533i = (NewPictureContainerIndicator) viewGroup.getChildAt(7);
        fs40Var.f100534j = (CardBottomBaseInfoView) viewGroup.getChildAt(9);
        fs40Var.f100535k = (CardUserContentView) viewGroup.getChildAt(10);
        fs40Var.f100536l = (VText) viewGroup.getChildAt(11);
    }

    /* JADX INFO: renamed from: b */
    public static View m131958b(fs40 fs40Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125999p8, viewGroup, false);
        m131957a(fs40Var, viewInflate);
        return viewInflate;
    }
}
