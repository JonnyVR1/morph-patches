package com.momo.mcamera.filtermanager;

import android.text.TextUtils;
import com.momo.mcamera.mask.bean.EffectFilterItem;
import java.io.File;
import p153l.AbstractC17634i4;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes6.dex */
public class EffectFilterCreator {
    public static FilterOptions getFilterOptions(EffectFilterItem effectFilterItem) {
        FilterOptions options = effectFilterItem.getOptions();
        if (options == null) {
            options = new FilterOptions();
            effectFilterItem.setOptions(options);
        }
        options.setName(effectFilterItem.getName());
        options.setImageFolderPath(effectFilterItem.getImageFolderPath());
        options.setFolder(effectFilterItem.getImageFolderPath() + File.separator + effectFilterItem.getFolder());
        return options;
    }

    public static AbstractC17634i4 getProcessFilter(EffectFilterItem effectFilterItem) {
        String name = effectFilterItem.getName();
        AbstractC17634i4 abstractC17634i4 = null;
        if (TextUtils.isEmpty(name)) {
            return null;
        }
        FilterOptions filterOptions = getFilterOptions(effectFilterItem);
        try {
            AbstractC17634i4 abstractC17634i5 = (AbstractC17634i4) Class.forName(EffectFilterKey.getInstance().effectFilterMap.get(name)).newInstance();
            if (abstractC17634i5 == null) {
                return abstractC17634i5;
            }
            try {
                abstractC17634i5.setFilterOptions(filterOptions);
                return abstractC17634i5;
            } catch (Exception e) {
                e = e;
                abstractC17634i4 = abstractC17634i5;
                e.printStackTrace();
                return abstractC17634i4;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
