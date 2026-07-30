package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.newui.mediaoperation.preview.item.PhotoPreviewView;
import l.e6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class lb70 {
    /* JADX INFO: renamed from: a */
    public static void m11635a(PhotoPreviewView photoPreviewView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        photoPreviewView.a = viewGroup.getChildAt(0);
        photoPreviewView.b = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m11636b(PhotoPreviewView photoPreviewView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(e6c0.m, viewGroup, true);
        m11635a(photoPreviewView, viewInflate);
        return viewInflate;
    }
}
