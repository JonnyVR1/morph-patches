package com.tantanapp.media.ttmediaeffect.filtermanager;

import android.content.Context;
import android.graphics.Bitmap;
import com.momo.mcamera.filtermanager.MMPresetFilterStore;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class TTPresetFilterStore {
    public static final String PATH_SHADER = "light_room_filters";

    public static String convertClassName(String str) {
        return MMPresetFilterStore.convertClassName(str);
    }

    public static void generateFilter(Context context, File file, TTPresetFilter tTPresetFilter) {
        MMPresetFilterStore.generateFilter(context, file, tTPresetFilter);
    }

    public static List<TTPresetFilter> generateProcessFilters(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = new File(getFilterFolder(context) + "/" + str).listFiles();
        if (fileArrListFiles != null) {
            Arrays.sort(fileArrListFiles);
            for (File file : fileArrListFiles) {
                TTPresetFilter presetFilterByFolder = getPresetFilterByFolder(context, file.getPath());
                if (presetFilterByFolder != null) {
                    arrayList.add(presetFilterByFolder);
                }
            }
        }
        return arrayList;
    }

    public static Bitmap getBitmapWithPath(String str, Context context) {
        return MMPresetFilterStore.getBitmapWithPath(str, context);
    }

    public static String getDataFilterFolder(Context context) {
        return MMPresetFilterStore.getDataFilterFolder(context);
    }

    public static String getFilterFolder(Context context) {
        return MMPresetFilterStore.getFilterFolder(context);
    }

    public static TTPresetFilter getPresetFilterByFolder(Context context, String str) {
        File file = new File(str);
        TTPresetFilter tTPresetFilter = new TTPresetFilter(context);
        tTPresetFilter.mFilterName = file.getName();
        if (file.list() == null) {
            return null;
        }
        generateFilter(context, file, tTPresetFilter);
        return tTPresetFilter;
    }
}
