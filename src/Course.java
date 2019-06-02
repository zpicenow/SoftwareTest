/**
 * @author ZhaoPeng
 * @date 2019/5/27
 */
public class Course {
    private int numStudents;
    private boolean isRegistration;
    private boolean isAssigned;

    /**
     * 构造函数，默认学生数为0，状态为flase
     */
    public Course() {
        numStudents = 0;
        isRegistration = false;
        isAssigned = false;
    }

    /**
     * 添加学生，如果学生已满则返回false
     * 否则学生数加一
     *
     * @return 是否添加成功
     */
    public boolean addStudent() {
        if (numStudents >= 10)
            return false;
        numStudents = numStudents + 1;

        return true;
    }

    /**
     * 移除学生，如果学生不为零则学生数减一
     * @return 是否移除成功
     */
    public boolean removeStudent() {
        if (numStudents > 0) {
            numStudents = numStudents - 1;
            return true;
        }
        return false;
    }

    /**
     * 对没有教授的班级添加教授，并更改isAssigned的值
     * @return 是否添加成功
     */
    public boolean addProfessor() {
        if (!isAssigned) {
            isAssigned = true;
            return true;
        }
        return false;
    }

    /**
     * 移除教授，对已经添加教授的班级移除教授
     * @return 是否移除成功
     */
    public boolean removeProfessor() {
        if (isAssigned) {
            isAssigned = false;
            return true;
        }
        return false;
    }

    /**
     * cancel状态
     * @return 是否成功
     */
    public boolean cancel() {
        if (SendNotice()) {
            return true;
        }
        return false;
    }

    /**
     * 更改Registration状态
     * @return isRegistration
     */
    public boolean closeRegistration() {
        if (numStudents >= 10 && isAssigned) {
            isRegistration = generateClassRoster();
        } else if (!(numStudents >= 10) && !isAssigned) {
            isRegistration = SendNotice();
        } else if (isAssigned && numStudents >= 3) {
            isRegistration = generateClassRoster();
        }
        return isRegistration;
    }

    /**
     * close操作，状态图涉及的
     * @return 是否close成功
     */
    public boolean close() {
        boolean flag = false;
        if (numStudents >= 10 && isAssigned) {
            flag = generateClassRoster();
        } else if (!(numStudents >= 10) && !isAssigned) {
            flag = SendNotice();
        } else if (isAssigned) {
            if (numStudents < 3) {
                flag = SendNotice();
            } else {
                flag = generateClassRoster();
            }
        }
        return flag;
    }

    /**
     * 桩函数，占位
     * @return 默认true
     */
    public boolean SendNotice() {
        //TODO
        return true;
    }

    /**
     * 桩函数，占位
     * @return 默认true
     */
    public boolean generateClassRoster() {
        //TODO
        return true;
    }
}

