package com.momo.mcamera.filtermanager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.momo.mcamera.filtermanager.filterext.BitmapBlendFilter;
import com.momo.mcamera.mask.MaskStore;
import com.momo.mcamera.mask.StickerAdjustFilter;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p149l.cn40;
import p149l.j3w;
import p149l.ts2;
import p149l.yhf0;

/* JADX INFO: loaded from: classes6.dex */
public class MMFilter implements Serializable {
    public static final long serialVersionUID = 8953832831202944607L;
    private transient Context context;
    public String mFilterName;
    public String mImageUri;
    private List<MMProcessUnit> mProcessUnits;

    public MMFilter(Context context) {
        this.mProcessUnits = new ArrayList();
        this.context = context;
    }

    public static Bitmap getBitmapByPath(String str, Context context) {
        return str.startsWith("light_room_filters") ? MMPresetFilterStore.getBitmapWithPath(str, context) : BitmapFactory.decodeFile(str);
    }

    public static ts2 getFilterByUnit(MMProcessUnit mMProcessUnit, Context context) {
        ts2 ts2Var = null;
        try {
            Class<?> cls = Class.forName(mMProcessUnit.getFilterName());
            ts2 ts2Var2 = (ts2) cls.newInstance();
            try {
                HashMap<String, Object> filterMap = mMProcessUnit.getFilterMap();
                if (filterMap != null) {
                    for (String str : filterMap.keySet()) {
                        cls.getDeclaredMethod(str, ClassUtil.getUsefulClass(filterMap.get(str))).invoke(ts2Var2, filterMap.get(str));
                    }
                }
                if (mMProcessUnit.getTexturePath1() != null && (ts2Var2 instanceof j3w)) {
                    ((j3w) ts2Var2).setLookupBitmap(getBitmapByPath(mMProcessUnit.getTexturePath1(), context));
                }
                return ts2Var2;
            } catch (ClassNotFoundException e) {
                e = e;
                ts2Var = ts2Var2;
                e.printStackTrace();
                return ts2Var;
            } catch (IllegalAccessException e2) {
                e = e2;
                ts2Var = ts2Var2;
                e.printStackTrace();
                return ts2Var;
            } catch (InstantiationException e3) {
                e = e3;
                ts2Var = ts2Var2;
                e.printStackTrace();
                return ts2Var;
            } catch (NoSuchMethodException e4) {
                e = e4;
                ts2Var = ts2Var2;
                e.printStackTrace();
                return ts2Var;
            } catch (InvocationTargetException e5) {
                e = e5;
                ts2Var = ts2Var2;
                e.printStackTrace();
                return ts2Var;
            }
        } catch (ClassNotFoundException e6) {
            e = e6;
        } catch (IllegalAccessException e7) {
            e = e7;
        } catch (InstantiationException e8) {
            e = e8;
        } catch (NoSuchMethodException e9) {
            e = e9;
        } catch (InvocationTargetException e10) {
            e = e10;
        }
    }

    public static List<ts2> getFilterGroupByUnits(Collection<MMProcessUnit> collection, Context context) {
        ArrayList arrayList = new ArrayList();
        for (MMProcessUnit mMProcessUnit : collection) {
            if (mMProcessUnit.isDecoration()) {
                StickerAdjustFilter stickerAdjustFilter = new StickerAdjustFilter(context);
                stickerAdjustFilter.enableSelfRender = true;
                stickerAdjustFilter.addMaskModel(MaskStore.getInstance().getMask(context, mMProcessUnit.getResourceName()));
                arrayList.add(stickerAdjustFilter);
            } else {
                try {
                    Class<?> cls = Class.forName(mMProcessUnit.getFilterName());
                    ts2 ts2Var = (ts2) cls.newInstance();
                    HashMap<String, Object> filterMap = mMProcessUnit.getFilterMap();
                    if (filterMap != null) {
                        for (String str : filterMap.keySet()) {
                            cls.getDeclaredMethod(str, ClassUtil.getUsefulClass(filterMap.get(str))).invoke(ts2Var, filterMap.get(str));
                        }
                    }
                    if (mMProcessUnit.getTexturePath1() != null) {
                        if (ts2Var instanceof j3w) {
                            if (mMProcessUnit.getTexturePath1().startsWith("light_room_filters")) {
                                ((j3w) ts2Var).setAssetResourcesId(context, mMProcessUnit.getTexturePath1());
                            } else {
                                ((j3w) ts2Var).setLookUpPath(mMProcessUnit.getTexturePath1());
                            }
                        } else if (ts2Var instanceof BitmapBlendFilter) {
                            ((BitmapBlendFilter) ts2Var).setBlendBitmap(getBitmapByPath(mMProcessUnit.getTexturePath1(), context));
                        }
                    }
                    arrayList.add(ts2Var);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (InstantiationException e3) {
                    e3.printStackTrace();
                } catch (NoSuchMethodException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
            }
        }
        if (arrayList.size() == 0) {
            arrayList.add(new cn40());
        }
        return arrayList;
    }

    public yhf0 getFilterGroup() {
        return new yhf0(getFilterGroupByUnits(getProcessUnits(), this.context));
    }

    public String getFilterName() {
        if (!TextUtils.isEmpty(this.mFilterName)) {
            this.mFilterName.replace(".", "_");
            String[] strArrSplit = this.mFilterName.split("_");
            if (strArrSplit.length > 1) {
                return strArrSplit[1];
            }
        }
        return this.mFilterName;
    }

    public String getKey() {
        return ".....";
    }

    public List<MMProcessUnit> getProcessUnits() {
        return this.mProcessUnits;
    }

    public void setProcessUnits(List<MMProcessUnit> list) {
        this.mProcessUnits = list;
    }

    public MMFilter() {
    }
}
