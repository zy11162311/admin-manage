package org.bumishi.admin.domain.modle;

/**
 * @author qiang.xie
 * @date 2016/10/28
 */
public class SelectMenu {

    private String mid;//菜单id

    private String label;

    private boolean checked;//角色是否有此菜单权限

    public SelectMenu() {
    }

    public SelectMenu(String mid, String label, boolean checked) {
        this.mid = mid;
        this.label = label;
        this.checked = checked;
    }

    public String getMid() {
        return mid;
    }

    public String getLabel() {
        return label;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
