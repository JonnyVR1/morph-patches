package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.internal.ParcelableSparseArray;
import p149l.ig3;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class BadgeUtils {
    public static final boolean USE_COMPAT_PARENT = false;

    private BadgeUtils() {
    }

    public static void attachBadgeDrawable(@NonNull BadgeDrawable badgeDrawable, @NonNull View view, @NonNull FrameLayout frameLayout) {
        setBadgeDrawableBounds(badgeDrawable, view, frameLayout);
        if (USE_COMPAT_PARENT) {
            frameLayout.setForeground(badgeDrawable);
        } else {
            view.getOverlay().add(badgeDrawable);
        }
    }

    @NonNull
    public static SparseArray<BadgeDrawable> createBadgeDrawablesFromSavedStates(Context context, @NonNull ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i = 0; i < parcelableSparseArray.size(); i++) {
            int iKeyAt = parcelableSparseArray.keyAt(i);
            BadgeDrawable.SavedState savedState = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i);
            if (savedState == null) {
                ig3.m135964a("BadgeDrawable's savedState cannot be null");
                return null;
            }
            sparseArray.put(iKeyAt, BadgeDrawable.createFromSavedState(context, savedState));
        }
        return sparseArray;
    }

    @NonNull
    public static ParcelableSparseArray createParcelableBadgeStates(@NonNull SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            int iKeyAt = sparseArray.keyAt(i);
            BadgeDrawable badgeDrawableValueAt = sparseArray.valueAt(i);
            if (badgeDrawableValueAt == null) {
                ig3.m135964a("badgeDrawable cannot be null");
                return null;
            }
            parcelableSparseArray.put(iKeyAt, badgeDrawableValueAt.getSavedState());
        }
        return parcelableSparseArray;
    }

    public static void detachBadgeDrawable(@Nullable BadgeDrawable badgeDrawable, @NonNull View view, @NonNull FrameLayout frameLayout) {
        if (badgeDrawable == null) {
            return;
        }
        if (USE_COMPAT_PARENT) {
            frameLayout.setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    public static void setBadgeDrawableBounds(@NonNull BadgeDrawable badgeDrawable, @NonNull View view, @NonNull FrameLayout frameLayout) {
        Rect rect = new Rect();
        (USE_COMPAT_PARENT ? frameLayout : view).getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.updateBadgeCoordinates(view, frameLayout);
    }

    public static void updateBadgeBounds(@NonNull Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
