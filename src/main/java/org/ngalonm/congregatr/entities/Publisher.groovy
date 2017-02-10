package org.ngalonm.congregatr.entities

/**
 * Created by phoenix on 10/02/17.
 */
class Publisher extends BaseEntity {
    private String name
    private String middleName
    private String surname
    private Date dob
    private Date baptismDate
    private boolean baptized
    private boolean active
    private List<String> phoneNumbers

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getMiddleName() {
        return middleName
    }

    void setMiddleName(String middleName) {
        this.middleName = middleName
    }

    String getSurname() {
        return surname
    }

    void setSurname(String surname) {
        this.surname = surname
    }

    boolean getDob() {
        return dob
    }

    void setDob(Date dob) {
        this.dob = dob
    }

    boolean isActive() {
        return active
    }

    void setActive(boolean active) {
        this.active = active
    }

    Date getBaptismDate() {
        return baptismalDate
    }

    void setBaptismDate(Date baptismDate) {
        this.baptismalDate = baptismDate
    }

    boolean isBaptized() {
        return baptized
    }

    void setBaptized(boolean baptized) {
        this.baptized = baptized
    }

    List<String> getPhoneNumbers() {
        return phoneNumbers
    }

    void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers
    }

    boolean addPhoneNumber(String phoneNumber) {
        if (phoneNumbers == null)
            false
        else
            phoneNumbers.add(phoneNumber)
    }
}
